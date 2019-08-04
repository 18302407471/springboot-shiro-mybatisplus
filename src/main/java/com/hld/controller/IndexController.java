package com.hld.controller;

import com.hld.entity.User;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    /**
     * 首页，并将登录用户的全名返回前台
     * @param model
     * @return
     */
    @RequestMapping(value = {"/", "/index"})
    public String index(Model model) {
        User sysUser = (User) SecurityUtils.getSubject().getPrincipal();
        model.addAttribute("userName", sysUser.getFullName());
        return "index";
    }
}