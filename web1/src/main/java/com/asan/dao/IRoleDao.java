package com.asan.dao;

import com.asan.pojo.Role;

import java.util.List;

public interface IRoleDao {

    /**
     * 获取角色列表
     * @param role
     * @param skip
     * @param rows
     * @return
     */
    public List<Role> listRoles(Role role, int skip, int rows);
    public String executSql(String sql);
}

