package com.hld.service.impl;

import com.hld.entity.Permission;
import com.hld.mapper.PermissionMapper;
import com.hld.service.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dhl
 * @since 2019-08-04
 */
@Service
public class PermissionService extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

    @Autowired
    PermissionMapper permissionMapper;

    @Override
    public List<String> selectPermissionByUserId(Long userId) {
        return permissionMapper.selectPermissionByUserId(userId);
    }
}
