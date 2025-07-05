package com.qy.utils;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class PDFutil {
    private static PdfStamper stamper;
    private static AcroFields form;

    private static void fillImageField(String fieldName,String imagePath) throws DocumentException, IOException {
        int pageNo = form.getFieldPositions(fieldName).get(0).page;
        Rectangle signRect = form.getFieldPositions(fieldName).get(0).position;
        float x = signRect.getLeft();
        float y = signRect.getBottom();

        // 读图片
        Image image = Image.getInstance(imagePath);

        // 获取操作的页面
        PdfContentByte under = stamper.getOverContent(pageNo);

        // 根据域的大小缩放图片
        image.scaleToFit(signRect.getWidth(), signRect.getHeight());

        // 添加图片
        image.setAbsolutePosition(x, y);
        under.addImage(image);
    }

    private static void fillTextField(String fieldName,String textValue) throws DocumentException, IOException {
        form.setFieldProperty(fieldName, "bgcolor", null, null);
        form.setField(fieldName, textValue);
    }

    public static void fillField(String templatePath, String targetPath,
                                 Map<String, String> mapValue)
            throws IOException, DocumentException {
        // 读取模板文件
        InputStream input = new FileInputStream(templatePath);
        PdfReader reader = new PdfReader(input);
        PdfStamper stamper2 = new PdfStamper(reader, new FileOutputStream(targetPath));
        stamper = stamper2;
        // 提取pdf中的表单
        AcroFields form2 = stamper2.getAcroFields();
        form=form2;
        mapValue.forEach((key, value) -> {
            if (key.startsWith("text")){
                try {
                    fillTextField(key,value);
                } catch (DocumentException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }else if(key.startsWith("image")){
                try {
                    fillImageField(key,value);
                } catch (DocumentException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        // 设置中文字体支持
        form.addSubstitutionFont(BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.EMBEDDED));
        stamper.close();
        reader.close();
    }
}
