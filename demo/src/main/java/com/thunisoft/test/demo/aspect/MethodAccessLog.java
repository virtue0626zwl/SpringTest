/**
 * @projectName demo
 * @package com.thunisoft.test.demo.aspect
 * @className com.thunisoft.test.demo.aspect.methodAccessLog
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.test.demo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * MethodAccessLog
 *
 * @description TODO
 * @author zouweilin
 * @date 2019/12/30 12:33
 * @version TODO
 */
@Slf4j
@Component
@Aspect
public class MethodAccessLog {

    @Around("execution(public * com.thunisoft.test.demo.controller.*.*(..))")
    public Object logServiceMethodAccess(ProceedingJoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = Objects.requireNonNull(attributes).getRequest();

        long start = System.currentTimeMillis();
        Object object = joinPoint.proceed();
        long end = System.currentTimeMillis();

        long time = end - start;

        log.info("请求方法：",request.getMethod());
        log.info("请求时间：",time);

        return object;
    }
}
