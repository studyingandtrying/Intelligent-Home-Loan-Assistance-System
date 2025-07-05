package com.qy.admin.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qy.admin.mapper.FinanceRecordsMapper;
import com.qy.admin.domain.FinanceRecords;
import com.qy.admin.service.IFinanceRecordsService;

/**
 * 财务记录：用户收支流水记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
@Service
public class FinanceRecordsServiceImpl implements IFinanceRecordsService 
{
    @Autowired
    private FinanceRecordsMapper financeRecordsMapper;

    /**
     * 查询财务记录：用户收支流水记录
     * 
     * @param id 财务记录：用户收支流水记录主键
     * @return 财务记录：用户收支流水记录
     */
    @Override
    public FinanceRecords selectFinanceRecordsById(Long id)
    {
        return financeRecordsMapper.selectFinanceRecordsById(id);
    }

    /**
     * 查询财务记录：用户收支流水记录列表
     * 
     * @param financeRecords 财务记录：用户收支流水记录
     * @return 财务记录：用户收支流水记录
     */
    @Override
    public List<FinanceRecords> selectFinanceRecordsList(FinanceRecords financeRecords)
    {
        return financeRecordsMapper.selectFinanceRecordsList(financeRecords);
    }

    /**
     * 新增财务记录：用户收支流水记录
     * 
     * @param financeRecords 财务记录：用户收支流水记录
     * @return 结果
     */
    @Override
    public int insertFinanceRecords(FinanceRecords financeRecords)
    {
        return financeRecordsMapper.insertFinanceRecords(financeRecords);
    }

    /**
     * 修改财务记录：用户收支流水记录
     * 
     * @param financeRecords 财务记录：用户收支流水记录
     * @return 结果
     */
    @Override
    public int updateFinanceRecords(FinanceRecords financeRecords)
    {
        return financeRecordsMapper.updateFinanceRecords(financeRecords);
    }

    /**
     * 批量删除财务记录：用户收支流水记录
     * 
     * @param ids 需要删除的财务记录：用户收支流水记录主键
     * @return 结果
     */
    @Override
    public int deleteFinanceRecordsByIds(Long[] ids)
    {
        return financeRecordsMapper.deleteFinanceRecordsByIds(ids);
    }

    /**
     * 删除财务记录：用户收支流水记录信息
     * 
     * @param id 财务记录：用户收支流水记录主键
     * @return 结果
     */
    @Override
    public int deleteFinanceRecordsById(Long id)
    {
        return financeRecordsMapper.deleteFinanceRecordsById(id);
    }
}
