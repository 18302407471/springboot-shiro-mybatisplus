package com.hld.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hld.entity.Permission;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dhl
 * @since 2019-08-04
 */
public interface IPermissionService extends IService<Permission> {

    List<String> selectPermissionByUserId(Long userId);
}
