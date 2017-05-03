package com.stone.lol.user.service;

import com.stone.lol.user.enums.LoginStatEnum;
import com.stone.lol.user.model.User;

/**
 * 用户操作Service
 */
public interface OperationService {
    LoginStatEnum login(User user);
}
