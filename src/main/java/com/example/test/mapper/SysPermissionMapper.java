package com.example.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.test.entity.SysPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 菜单权限表 Mapper 接口
 */
public interface SysPermissionMapper extends BaseMapper<SysPermission> {

    /**
     * 根据用户查询用户权限
     */
    public List<SysPermission> queryByUser(@Param("username") String username);

}
