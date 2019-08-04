package com.hld.common.shiro;

import com.hld.entity.User;
import com.hld.service.impl.PermissionService;
import com.hld.service.impl.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserRealm extends AuthorizingRealm {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserRealm.class);
    @Autowired
    private UserService sysUserService;

    @Autowired
    private PermissionService sysPermissionService;

    /**
     * 授权
     *
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        User sysUser = (User) principals.getPrimaryPrincipal();
        List<String> sysPermissions = sysPermissionService.selectPermissionByUserId(sysUser.getUserId());

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(sysPermissions);
        LOGGER.info("doGetAuthorizationInfo");
        return info;
    }

    /**
     * 认证
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        User sysUser = sysUserService.findByUserName(token.getUsername());
        if (sysUser == null) {
            return null;
        }
        LOGGER.info("doGetAuthenticationInfo");
        return new SimpleAuthenticationInfo(sysUser, sysUser.getPassword().toCharArray(), ByteSource.Util.bytes(sysUser.getSalt()), getName());
    }
}
