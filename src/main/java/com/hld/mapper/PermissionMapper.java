package com.hld.mapper;

import com.hld.entity.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dhl
 * @since 2019-08-04
 */
public interface PermissionMapper extends BaseMapper<Permission> {

    List<String> selectPermissionByUserId(@Param("userId")Long userId);
}
