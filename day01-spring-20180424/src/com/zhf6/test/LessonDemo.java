package com.zhf6.test;

import com.zhf6.service.IUserService;
import com.zhf6.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class LessonDemo {

    @Test
    public void test1(){
        //spring容器加载的3种方式
        //1.ClassPathXmlApplicationContext 类路径(相对路径)
        //最常用。spring配置文件直接放到src下
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        IUserService user1= (UserServiceImpl) context.getBean("userService1");
        user1.add();

        //2.通过文件系统路径获取配置文件(绝对路径)
        ApplicationContext context1 = new FileSystemXmlApplicationContext("C:\\Users\\17322\\IdeaProjects\\sping-demo\\day01-spring-20180424\\src\\beans.xml");
        IUserService user2 = (IUserService) context1.getBean("userService2");
        user2.add();

        //3.使用BeanFactory(了解)
//        过时
//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("C:\\Users\\17322\\IdeaProjects\\sping-demo\\day01-spring-20180424\\src\\beans.xml"));


    }
}//
