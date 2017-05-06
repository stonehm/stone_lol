package com.stone.lol.user.service;

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
        user.setUsername("admin");
        user.setPassword("admin123");
        managementService.add(user);
    }

    @Test
    public void remove() throws Exception {
        managementService.remove("8a506a085bdb657d015bdb658313000011");
    }

    @Test
    public void getByUsername() throws Exception {
        User user = managementService.getByUsername("admin123");
        logger.info(user.getId());
    }


}