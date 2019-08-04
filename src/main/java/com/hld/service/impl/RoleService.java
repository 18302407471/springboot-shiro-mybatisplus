package com.hld.service.impl;

import com.hld.entity.Role;
import com.hld.mapper.RoleMapper;
import com.hld.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dhl
 * @since 2019-08-04
 */
@Service
public class RoleService extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
