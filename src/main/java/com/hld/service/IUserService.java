package com.hld.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hld.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dhl
 * @since 2019-08-04
 */
public interface IUserService extends IService<User> {

    User findByUserName(String userName);
}
