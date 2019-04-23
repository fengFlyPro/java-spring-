package com.zhf6.test;

import com.zhf6.model.Programmer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson09 {

    @Test
    public void test() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("beans9.xml");
        Programmer programmer = (Programmer) context.getBean("programmer");
        System.out.println(programmer);
    }
}
