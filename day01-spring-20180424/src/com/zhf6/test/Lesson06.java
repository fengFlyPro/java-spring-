package com.zhf6.test;

import com.zhf6.model.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson06 {

    @Test
    public void test6() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("beans6.xml");
        Student stu  = (Student) context.getBean("stu");
        System.out.println(stu);

        Student stu1  = (Student) context.getBean("stu1");
        System.out.println(stu1);
    }
}
