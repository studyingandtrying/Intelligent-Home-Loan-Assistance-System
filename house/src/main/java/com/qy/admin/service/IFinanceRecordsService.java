package com.qy.admin.service;

import java.util.List;
import com.qy.admin.domain.FinanceRecords;

/**
 * 财务记录：用户收支流水记录Service接口
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
public interface IFinanceRecordsService 
{
    /**
     * 查询财务记录：用户收支流水记录
     * 
     * @param id 财务记录：用户收支流水记录主键
     * @return 财务记录：用户收支流水记录
     */
    public FinanceRecords selectFinanceRecordsById(Long id);

    /**
     * 查询财务记录：用户收支流水记录列表
     * 
     * @param financeRecords 财务记录：用户收支流水记录
     * @return 财务记录：用户收支流水记录集合
     */
    public List<FinanceRecords> selectFinanceRecordsList(FinanceRecords financeRecords);

    /**
     * 新增财务记录：用户收支流水记录
     * 
     * @param financeRecords 财务记录：用户收支流水记录
     * @return 结果
     */
    public int insertFinanceRecords(FinanceRecords financeRecords);

    /**
     * 修改财务记录：用户收支流水记录
     * 
     * @param financeRecords 财务记录：用户收支流水记录
     * @return 结果
     */
    public int updateFinanceRecords(FinanceRecords financeRecords);

    /**
     * 批量删除财务记录：用户收支流水记录
     * 
     * @param ids 需要删除的财务记录：用户收支流水记录主键集合
     * @return 结果
     */
    public int deleteFinanceRecordsByIds(Long[] ids);

    /**
     * 删除财务记录：用户收支流水记录信息
     * 
     * @param id 财务记录：用户收支流水记录主键
     * @return 结果
     */
    public int deleteFinanceRecordsById(Long id);
}
