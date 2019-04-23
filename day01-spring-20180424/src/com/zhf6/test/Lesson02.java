package com.zhf6.test;

import com.zhf6.service.IUserService;
import com.zhf6.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson02 {

    @Test
    public void test1(){
        IUserService userService = new UserServiceImpl();
        userService.add();
    }

    @Test
    public void test2(){
        //现在使用UserService从spring容器获取
        //1.加载beans.xml,内部就会创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //2.从spring容器获取userService对象
        IUserService userService1 = (IUserService) context.getBean("userService1");
        userService1.add();

        IUserService userService2 = (IUserService) context.getBean("userService2");
        userService2.add();

        System.out.println(userService1);
        System.out.println(userService2);
    }
}
