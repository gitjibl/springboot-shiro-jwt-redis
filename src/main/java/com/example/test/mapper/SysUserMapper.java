package com.example.test.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.test.entity.SysUser;
import org.apache.ibatis.annotations.Param;

/**
 * 用户表 Mapper 接口
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    /**
     * 通过用户账号查询用户信息
     *
     * @param username
     * @return
     */
    public SysUser getUserByName(@Param("username") String username);

}
