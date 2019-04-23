package com.zhf6.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect6 {

    public void myBefore() {
        System.out.println("前");
    }

    public void afterReturning() {
        System.out.println("后");
        System.out.println("--------------------------");
    }

    public Object myRound(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕");
        System.out.println("环绕前");
        Object retObj = pjp.proceed();
        System.out.println("环绕后");
        System.out.println("retObj：" + retObj);

        System.out.println("--------------------------");
        return retObj;
    }
}
