package com.stone.lol.user.service;

import com.stone.lol.user.dao.UserDao;
import com.stone.lol.user.entity.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: 孙皓亮
 * Date: 2017/5/4
 * Time: 15:23
 */
@Service
@Transactional
public class ManagementServiceImpl implements ManagementService {

    @Autowired
    private UserDao userDao;

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void remove() {

    }

    @Override
    public void update() {

    }

    @Override
    public void getByUsername() {

    }

    @Override
    public void getList() {

    }
}
