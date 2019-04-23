package com.zhf6.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect2 {

    public void myBefore(JoinPoint joinPoint) {
        System.out.println("1、前: " + joinPoint.getSignature().getName());
    }

    public void myAfterReturning(JoinPoint joinPoint, Object retValue) {
        System.out.println("2、后: " + joinPoint.getSignature().getName());
        System.out.println("retValue：" + retValue);
//        System.out.println("--------------------------");
    }

    public Object myRound(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("3、环绕前");
        Object retObj = pjp.proceed();
        System.out.println("环绕后");
//        System.out.println("retObj：" + retObj);
//        System.out.println("--------------------------");
        return retObj;
    }

    public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("4、异常通知：" + e.getMessage());
    }

    public void myAfter() {
        System.out.println("5、最终");
        System.out.println("-----------------------");
    }
}
