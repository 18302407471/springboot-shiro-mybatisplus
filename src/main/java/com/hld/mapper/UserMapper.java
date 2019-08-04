package com.hld.mapper;

import com.hld.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dhl
 * @since 2019-08-04
 */
public interface UserMapper extends BaseMapper<User> {

    User findByUserName(@Param("userName")String userName);
}
