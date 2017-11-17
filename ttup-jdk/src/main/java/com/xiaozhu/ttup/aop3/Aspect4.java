package com.xiaozhu.ttup.aop3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Aspect: 指定是一个切面
 * @Component: 指定可以被Spring容器扫描到
 */
@Aspect
@Component
public class Aspect4 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Aspect4.class);

    @Before("execution(* com.xiaozhu.ttup.aop.OrderServiceImpl.*(..))")
    public void before(JoinPoint point) {
        System.out.printf("前置增强before2 %s%n", point.getKind());
    }

    @AfterReturning(value = "execution(* com.xiaozhu.ttup.aop.OrderServiceImpl.d*(..))", returning = "result")
    public void afterReturning(JoinPoint point, Object result) {
        System.out.printf("后置增强, 结果为 %s%n", result);
    }

    @Around("execution(* com.xiaozhu.ttup.aop.OrderServiceImpl.*(..))")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = point.proceed(point.getArgs());
        long time = System.currentTimeMillis() - start;

        System.out.printf("method %s invoke consuming %d ms%n", point.toLongString(), time);

        return result;
    }

    @AfterThrowing(value = "execution(* com.xiaozhu.ttup.aop.OrderServiceImpl.*(..))", throwing = "ex")
    public void afterThrowing(JoinPoint point, Throwable ex) {
        String message = new StringBuilder("method ").append(point.getSignature().getName()).append(" error").toString();
        System.out.println(message);

        LOGGER.error("{},", message, ex);
    }

    @After("OrderServicePointcut.pointcut()")
    public void after(JoinPoint point) {
        System.out.println("最终通知, 释放资源");
    }
}
