package com.xiaozhu.ttup.aop3;

import org.aspectj.lang.annotation.Pointcut;

public class OrderServicePointcut {

    @Pointcut("execution(* com.xiaozhu.ttup.aop.OrderServiceImpl.*(..))")
    public void pointcut() {
    }
}
