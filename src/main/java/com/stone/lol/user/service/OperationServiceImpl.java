package com.stone.lol.user.service;

import com.stone.lol.user.dao.UserDao;
import com.stone.lol.user.enums.LoginStatEnum;
import com.stone.lol.user.entity.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OperationServiceImpl implements OperationService {

    private final UserDao userDao;

    @Autowired
    public OperationServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public LoginStatEnum login(User user) {
        User tmp = userDao.getByUsername(user.getUsername());
        if (tmp == null)
            return LoginStatEnum.NOT_FOUND;
        if (tmp.getId().equals("测试被锁账号"))
            return LoginStatEnum.LOCKED;
        if (!tmp.getPassword().equals(user.getPassword()))
            return LoginStatEnum.PASSWORD_ERROR;
        user.setId(tmp.getId());
        return LoginStatEnum.SUCCESS;
    }
}
