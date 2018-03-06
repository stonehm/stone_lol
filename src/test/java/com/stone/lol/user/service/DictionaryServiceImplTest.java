package com.stone.lol.user.service;

import com.stone.lol.user.entity.po.Dictionary;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Lenovo on 2017/6/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class DictionaryServiceImplTest {

    @Autowired
    private DictionaryService dictionaryService;

    @Test
    public void add() throws Exception {
        Dictionary dic = new Dictionary();
        dic.setName("大区");
        dictionaryService.add(dic);
    }

    @Test
    public void add2() throws Exception {
        Dictionary dic = new Dictionary();
        Dictionary p = new Dictionary();
        p.setId("402881e45c91e90d015c91e911220000");
        dic.setParent(p);
        dic.setName("其他");
        dictionaryService.add(dic);
    }

    @Test
    public void remove() throws Exception {

    }

    @Test
    public void update() throws Exception {
        List list = dictionaryService.getDictionaryByParent("402881e45c91e90d015c91e911220000");
        ((Dictionary)list.get(0)).setName("网通");
        dictionaryService.update((Dictionary) list.get(0));
    }

    @Test
    public void getDictionaryByParent() throws Exception {
        System.out.println(dictionaryService.getDictionaryByParent("402881e45c91e90d015c91e911220000"));
    }
}