package com.stone.lol.user.service;

import com.stone.lol.user.enums.LoginStatEnum;
import com.stone.lol.user.entity.po.User;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {

    @Override
    public LoginStatEnum login(User user) {
        System.out.println(user.getUsername() + "|" + user.getPassword());
        return null;
    }
}
