package com.example.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.test.entity.SysUser;
import com.example.test.util.Result;

import java.util.Set;

public interface ISysUserService extends IService<SysUser> {

    public SysUser getUserByName(String username);

    /**
     * 通过用户名获取用户角色集合
     *
     * @param username 用户名
     * @return 角色集合
     */
    Set<String> getUserRolesSet(String username);

    /**
     * 通过用户名获取用户权限集合
     *
     * @param username 用户名
     * @return 权限集合
     */
    Set<String> getUserPermissionsSet(String username);

    /**
     * 校验用户是否有效
     *
     * @param sysUser
     * @return
     */
    Result checkUserIsEffective(SysUser sysUser);

}
