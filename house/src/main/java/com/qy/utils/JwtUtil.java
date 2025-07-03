package com.qy.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.UUID;

/**
 * JWT工具类
 */
public class JwtUtil {

    private static final SignatureAlgorithm SIGNATURE_ALGORITHM = SignatureAlgorithm.HS256;
    private static final String SECRET_KEY = "aVerySecureKeyWithAtLeast32Characters1234567890";

    // 默认有效期为1小时

    /**
     * 创建token
     *
     * @param id       唯一ID
     * @param subject  主题
     * @return 生成的JWT
     */
    public static String createJWT(String id, String subject) {

        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        return Jwts.builder()
                .setId(id)
                .setSubject(subject)
                .setIssuedAt(now)
                .signWith(SIGNATURE_ALGORITHM,SECRET_KEY)
                .compact();
    }

    /**
     * 解析JWT
     *
     * @param jwt 需要解析的JWT
     * @return Claims对象
     * @throws Exception 如果解析失败
     */
    public static Claims parseJWT(String jwt) throws Exception {
        return Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(jwt)
                .getBody();
    }

    public static void main(String[] args) {
        // 示例用法
        String id = UUID.randomUUID().toString();
        String subject = "testUser";
        String jwt = createJWT(id, subject);
        System.out.println("Generated JWT: " + jwt);

        try {
            Claims claims = parseJWT(jwt);
            System.out.println("Parsed Claims: " + claims.getSubject());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
