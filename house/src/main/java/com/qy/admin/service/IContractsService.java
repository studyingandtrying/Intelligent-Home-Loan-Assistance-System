package com.qy.admin.service;

import java.util.List;
import com.qy.admin.domain.Contracts;

/**
 * 合同：租赁合同信息Service接口
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
public interface IContractsService 
{
    /**
     * 查询合同：租赁合同信息
     * 
     * @param id 合同：租赁合同信息主键
     * @return 合同：租赁合同信息
     */
    public Contracts selectContractsById(Long id);

    /**
     * 查询合同：租赁合同信息列表
     * 
     * @param contracts 合同：租赁合同信息
     * @return 合同：租赁合同信息集合
     */
    public List<Contracts> selectContractsList(Contracts contracts);

    /**
     * 新增合同：租赁合同信息
     * 
     * @param contracts 合同：租赁合同信息
     * @return 结果
     */
    public int insertContracts(Contracts contracts);

    /**
     * 修改合同：租赁合同信息
     * 
     * @param contracts 合同：租赁合同信息
     * @return 结果
     */
    public int updateContracts(Contracts contracts);

    /**
     * 批量删除合同：租赁合同信息
     * 
     * @param ids 需要删除的合同：租赁合同信息主键集合
     * @return 结果
     */
    public int deleteContractsByIds(Long[] ids);

    /**
     * 删除合同：租赁合同信息信息
     * 
     * @param id 合同：租赁合同信息主键
     * @return 结果
     */
    public int deleteContractsById(Long id);
}
