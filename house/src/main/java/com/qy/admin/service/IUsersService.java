package com.qy.admin.service;

import java.util.List;
import com.qy.admin.domain.Users;

/**
 * 用户：存储租客/房东/管理员信息Service接口
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
public interface IUsersService 
{
    /**
     * 查询用户：存储租客/房东/管理员信息
     * 
     * @param id 用户：存储租客/房东/管理员信息主键
     * @return 用户：存储租客/房东/管理员信息
     */
    public Users selectUsersById(Long id);

    /**
     * 查询用户：存储租客/房东/管理员信息列表
     * 
     * @param users 用户：存储租客/房东/管理员信息
     * @return 用户：存储租客/房东/管理员信息集合
     */
    public List<Users> selectUsersList(Users users);

    /**
     * 新增用户：存储租客/房东/管理员信息
     * 
     * @param users 用户：存储租客/房东/管理员信息
     * @return 结果
     */
    public int insertUsers(Users users);

    /**
     * 修改用户：存储租客/房东/管理员信息
     * 
     * @param users 用户：存储租客/房东/管理员信息
     * @return 结果
     */
    public int updateUsers(Users users);

    /**
     * 批量删除用户：存储租客/房东/管理员信息
     * 
     * @param ids 需要删除的用户：存储租客/房东/管理员信息主键集合
     * @return 结果
     */
    public int deleteUsersByIds(Long[] ids);

    /**
     * 删除用户：存储租客/房东/管理员信息信息
     * 
     * @param id 用户：存储租客/房东/管理员信息主键
     * @return 结果
     */
    public int deleteUsersById(Long id);
}
