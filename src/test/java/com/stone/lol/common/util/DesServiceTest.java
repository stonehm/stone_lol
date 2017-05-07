package com.stone.lol.common.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试des加解密
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class DesServiceTest {

    @Autowired
    private DesService desService;

    @Test
    public void test() throws Exception {
        String data = "stone加解密";
        String result = desService.encrypt(data);
        System.out.println(String.format("data=[%s],result=[%s]", data, result));
        data = desService.decrypt(result);
        System.out.println(String.format("data=[%s],result=[%s]", result, data));
    }

}