package com.stone.lol.user.controller;

import com.stone.lol.common.service.LogService;
import com.stone.lol.user.entity.po.User;
import com.stone.lol.user.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 用户操作Controller
 */
@Controller
@RequestMapping("/stone/user/operation")
public class OperationController {

    private final OperationService operationService;
    private final LogService logService;

    @Autowired
    public OperationController(OperationService operationService, LogService logService) {
        this.operationService = operationService;
        this.logService = logService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin123456");
        operationService.login(user);
        logService.addLog("用户登录");
        return "hello";
    }
}
