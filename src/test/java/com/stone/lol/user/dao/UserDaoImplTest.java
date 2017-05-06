package com.stone.lol.user.dao;

import com.stone.lol.user.entity.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * User: 孙皓亮
 * Date: 2017/5/6
 * Time: 9:24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-*.xml"})
public class UserDaoImplTest {

    private static final Logger logger = LoggerFactory.getLogger(UserDaoImplTest.class);

    @Autowired
    UserDao userDao;

    @Test
    public void add() throws Exception {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin123");
        String id = userDao.add(user);
        logger.info(id);
    }

    @Test
    public void delete() throws Exception {

        userDao.delete("8a506a085bdb657d015bdb6583130000");
    }

    @Test
    public void update() throws Exception {
        User user = new User();
        user.setId("8a506a085bdb657d015bdb6583130000");
        user.setUsername("admin123");
        user.setPassword("admin456");
        userDao.update(user);
    }

    @Test
    public void getByUsername() throws Exception {
        User user = userDao.getByUsername("admin123");
        logger.info("userId|{}|username|{}|password|{}",user.getId(),user.getUsername(),user.getPassword());
    }

    @Test
    public void getList() throws Exception {

    }

}