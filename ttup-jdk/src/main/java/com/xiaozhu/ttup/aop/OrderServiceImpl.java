package com.xiaozhu.ttup.aop;

import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

    @Override
    public void save() {
        System.out.println("添加...");
    }

    @Override
    public Integer delete(Integer param) {
        System.out.println("删除...");
        return param;
    }

}
