package com.stone.lol.user.controller;

import com.stone.lol.common.log.service.LogService;
import com.stone.lol.user.entity.po.User;
import com.stone.lol.user.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 用户管理控制器
 */
@Controller
@RequestMapping("/stone/user/management")
public class ManagementController {

    private final ManagementService managementService;
    private final LogService logService;

    @Autowired
    public ManagementController(ManagementService managementService, LogService logService) {
        this.managementService = managementService;
        this.logService = logService;
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(@ModelAttribute("username") String username, @ModelAttribute("password") String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        System.out.println(username + "," + password);
        managementService.add(user);
        logService.addLog(user, "用户添加");
        return "hello";
    }
}
