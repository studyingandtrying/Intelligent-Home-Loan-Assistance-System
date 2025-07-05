package com.qy.admin.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qy.admin.mapper.ContractsMapper;
import com.qy.admin.domain.Contracts;
import com.qy.admin.service.IContractsService;

/**
 * 合同：租赁合同信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
@Service
public class ContractsServiceImpl implements IContractsService 
{
    @Autowired
    private ContractsMapper contractsMapper;

    /**
     * 查询合同：租赁合同信息
     * 
     * @param id 合同：租赁合同信息主键
     * @return 合同：租赁合同信息
     */
    @Override
    public Contracts selectContractsById(Long id)
    {
        return contractsMapper.selectContractsById(id);
    }

    /**
     * 查询合同：租赁合同信息列表
     * 
     * @param contracts 合同：租赁合同信息
     * @return 合同：租赁合同信息
     */
    @Override
    public List<Contracts> selectContractsList(Contracts contracts)
    {
        return contractsMapper.selectContractsList(contracts);
    }

    /**
     * 新增合同：租赁合同信息
     * 
     * @param contracts 合同：租赁合同信息
     * @return 结果
     */
    @Override
    public int insertContracts(Contracts contracts)
    {
        return contractsMapper.insertContracts(contracts);
    }

    /**
     * 修改合同：租赁合同信息
     * 
     * @param contracts 合同：租赁合同信息
     * @return 结果
     */
    @Override
    public int updateContracts(Contracts contracts)
    {
        return contractsMapper.updateContracts(contracts);
    }

    /**
     * 批量删除合同：租赁合同信息
     * 
     * @param ids 需要删除的合同：租赁合同信息主键
     * @return 结果
     */
    @Override
    public int deleteContractsByIds(Long[] ids)
    {
        return contractsMapper.deleteContractsByIds(ids);
    }

    /**
     * 删除合同：租赁合同信息信息
     * 
     * @param id 合同：租赁合同信息主键
     * @return 结果
     */
    @Override
    public int deleteContractsById(Long id)
    {
        return contractsMapper.deleteContractsById(id);
    }
}
