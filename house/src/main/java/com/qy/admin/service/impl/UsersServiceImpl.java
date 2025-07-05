package com.qy.admin.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qy.admin.mapper.UsersMapper;
import com.qy.admin.domain.Users;
import com.qy.admin.service.IUsersService;

/**
 * 用户：存储租客/房东/管理员信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
@Service
public class UsersServiceImpl implements IUsersService 
{
    @Autowired
    private UsersMapper usersMapper;

    /**
     * 查询用户：存储租客/房东/管理员信息
     * 
     * @param id 用户：存储租客/房东/管理员信息主键
     * @return 用户：存储租客/房东/管理员信息
     */
    @Override
    public Users selectUsersById(Long id)
    {
        return usersMapper.selectUsersById(id);
    }

    /**
     * 查询用户：存储租客/房东/管理员信息列表
     * 
     * @param users 用户：存储租客/房东/管理员信息
     * @return 用户：存储租客/房东/管理员信息
     */
    @Override
    public List<Users> selectUsersList(Users users)
    {
        return usersMapper.selectUsersList(users);
    }

    /**
     * 新增用户：存储租客/房东/管理员信息
     * 
     * @param users 用户：存储租客/房东/管理员信息
     * @return 结果
     */
    @Override
    public int insertUsers(Users users)
    {
        return usersMapper.insertUsers(users);
    }

    /**
     * 修改用户：存储租客/房东/管理员信息
     * 
     * @param users 用户：存储租客/房东/管理员信息
     * @return 结果
     */
    @Override
    public int updateUsers(Users users)
    {
        return usersMapper.updateUsers(users);
    }

    /**
     * 批量删除用户：存储租客/房东/管理员信息
     * 
     * @param ids 需要删除的用户：存储租客/房东/管理员信息主键
     * @return 结果
     */
    @Override
    public int deleteUsersByIds(Long[] ids)
    {
        return usersMapper.deleteUsersByIds(ids);
    }

    /**
     * 删除用户：存储租客/房东/管理员信息信息
     * 
     * @param id 用户：存储租客/房东/管理员信息主键
     * @return 结果
     */
    @Override
    public int deleteUsersById(Long id)
    {
        return usersMapper.deleteUsersById(id);
    }
}
