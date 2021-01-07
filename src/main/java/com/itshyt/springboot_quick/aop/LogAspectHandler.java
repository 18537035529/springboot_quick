package com.itshyt.springboot_quick.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class LogAspectHandler {
    private final Logger logger = LoggerFactory.getLogger(LogAspectHandler.class);
    /**
     * @Pointcut 用来定义一个切面，也就是关注的某件事情的入口
     */
    @Pointcut("execution(* com.itshyt.springboot_quick.controller..*.*(..))")
    public void point(){
        logger.info("孙悟空被压五行山500年");
    }
    /*
     *在上述定义的切面方法之前执行
     */
    @Before("point()")
    public void doBefore(JoinPoint joinPoint){
        logger.info("进入doBefore方法-------");
        Signature sign= joinPoint.getSignature();
        //获取切入的包名
        String declaringTypeName = sign.getDeclaringTypeName();
        //获取即将执行的方法名
        String methodName=sign.getName();
        logger.info("即将执行的方法名为"+methodName+"属于包"+declaringTypeName);
        //也可以用来记录一些信息，比如获取请求的url和ip
        ServletRequestAttributes servletRequest = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequest.getRequest();
        String url = request.getRequestURI().toString();
        String ip = request.getRemoteAddr();
        logger.info("doBefore方法执行完毕，请求中的url为："+url+",请求ip为："+ip);

    }
    /**
     * @After与@Before对应，在切入方法之后执行
      */
    @After("point()")
    public void doAfter(JoinPoint joinPoint){
        logger.info("进入doAfter方法-------");
        Signature signature = joinPoint.getSignature();
        String method = signature.getName();
        logger.info("doAfter方法执行完毕，执行方法为"+method);
    }
}
