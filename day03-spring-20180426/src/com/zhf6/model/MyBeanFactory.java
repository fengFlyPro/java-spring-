package com.zhf6.model;

import com.zhf6.aspect.MyAspect;
import com.zhf6.service.IUserService;
import com.zhf6.service.StudentService;
import com.zhf6.service.UserServiceImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {
    public static IUserService createUserService() {
        //1.目标类
        final IUserService userService = new UserServiceImpl();
        System.out.println(userService);
        //2.切面类
        final MyAspect aspect = new MyAspect();
        //3.代理类-将目标类和切面类结合
        IUserService proxyService = (IUserService) Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(),
                userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //执行前
                        aspect.before();
                        //放行
                        Object obj = method.invoke(userService, args);
                        System.out.println("拦截返回值：" + obj);
                        //执行后
                        aspect.after();
                        return obj;
                    }
                });
        return proxyService;
    }//


    public static StudentService createStudentService() {
        //1.目标类
        final StudentService studentService = new StudentService();
        System.out.println(studentService);

        //2.切面类
        final MyAspect aspect = new MyAspect();

        //3.cglibe核心类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(studentService.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                aspect.before();

                Object obj = method.invoke(studentService, args);
//                Object obj = methodProxy.invoke(proxy,args);
                aspect.after();
                return obj;
            }
        });
        StudentService proxy = (StudentService) enhancer.create();
        return proxy;
    }



}