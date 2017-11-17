package com.xiaozhu.ttup.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext3.xml")
public class AOPClient3 {

    @Autowired
    // 必须指定使用代理对象名称, 否则不予代理
//    @Qualifier("serviceProxy")
    private OrderService service;

    @Test
    public void client() {
        service.save();
        service.delete(88);
    }
}