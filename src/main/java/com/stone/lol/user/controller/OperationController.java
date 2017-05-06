package com.stone.lol.user.controller;

import com.stone.lol.common.log.service.LogService;
import com.stone.lol.user.entity.po.User;
import com.stone.lol.user.enums.LoginStatEnum;
import com.stone.lol.user.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

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
    public String loginGet() {
        return "user/login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@ModelAttribute("username") String username, @ModelAttribute("password") String password, HttpSession session) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        LoginStatEnum stat = operationService.login(user);
        if (stat == LoginStatEnum.SUCCESS) { // 登录成功
            session.setAttribute("user", user);
            logService.addLog(user, "用户登录" + stat.getStateInfo());
        }
        return "hello";
    }
}
