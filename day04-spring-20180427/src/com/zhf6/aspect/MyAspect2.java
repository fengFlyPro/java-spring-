package com.zhf6.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect2 {
    //相当于一个公共切入点
    @Pointcut("execution(* com.zhf6.service.StudentService.*(..))")
    public void myCutPoint(){}

   // @Before(value = "myCutPoint()")
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("1、前: " + joinPoint.getSignature().getName());
    }

   // @AfterReturning(value = "myCutPoint()", returning = "retValue")
    public void myAfterReturning(JoinPoint joinPoint, Object retValue) {
        System.out.println("2、后: " + joinPoint.getSignature().getName());
        System.out.println("retValue：" + retValue);
//        System.out.println("--------------------------");
    }

    @Around(value = "myCutPoint()")
    public Object myRound(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("3、环绕前");
        Object retObj = pjp.proceed();
        System.out.println("环绕后");
//        System.out.println("retObj：" + retObj);
//        System.out.println("--------------------------");
        return retObj;
    }

    @AfterThrowing(value = "myCutPoint()", throwing = "e")
    public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("4、异常通知：" + e.getMessage());
    }

    @After(value = "myCutPoint()")
    public void myAfter() {
        System.out.println("5、最终");
        System.out.println("-----------------------");
    }
}
