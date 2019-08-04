package com.hld.service.impl;

import com.hld.entity.User;
import com.hld.mapper.UserMapper;
import com.hld.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
public class UserService extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public User findByUserName(String userName) {
        return userMapper.findByUserName(userName);
    }
}
