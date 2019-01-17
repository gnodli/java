package com.zdd.noob.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @${DESCRIPTION}
 *
 * @author zdd
 * @create
 */
@Aspect
@Component
@Slf4j
public class TestAop {

    @Pointcut("execution(* com.zdd.noob.service.UserServiceImpl.login(..))")
    public void loginPoint() {

    }

    @Pointcut("execution(* com.zdd.noob.service.UserServiceImpl.register(..))")
    public void registerPoint() {

    }

    /**
     * 前置通知：在方法执行前执行的代码
     * @param joinPoint
     */
    @Before(value = "loginPoint() || registerPoint()")
    public void beforeExecute(JoinPoint joinPoint){
        String methordName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
    }
}
