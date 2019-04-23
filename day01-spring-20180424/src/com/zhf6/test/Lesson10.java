package com.zhf6.test;

import com.zhf6.model.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson10 {

    @Test
    public void test() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("beans10.xml");
        Student stu = (Student) context.getBean(Student.class);
        System.out.println(stu);

    }
}
