package com.stone.lol.user.service;

import com.stone.lol.user.entity.po.Authority;
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
 * Date: 2017/5/4
 * Time: 16:49
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-*.xml"})
public class ManagementServiceImplTest {

    private static final Logger logger = LoggerFactory.getLogger(ManagementServiceImplTest.class);
    @Autowired
    private ManagementService managementService;

    @Test
    public void add() throws Exception {
        User user = new User();
        Authority authority = new Authority();
        authority.setName("管理员");
        authority.setLevel(99);
        authority.setId("40a0b1f3330411e7a9620023248ece0e");
        user.setUsername("admin");
        user.setPassword("admin123");
        user.setName("孙皓亮");
        user.setAuthority(authority);
        managementService.add(user);
    }

    @Test
    public void remove() throws Exception {
        managementService.remove("8a506a085bdb657d015bdb6583130000");
    }

    @Test
    public void getByUsername() throws Exception {
        User user = managementService.getByUsername("adminH");
        logger.info(user.getId());
        logger.info(user.getAuthority().getName());
    }


}