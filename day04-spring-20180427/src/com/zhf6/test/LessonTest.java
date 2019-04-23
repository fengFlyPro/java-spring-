package com.zhf6.test;

import com.zhf6.model.Student;
import com.zhf6.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LessonTest {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans01.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");
        studentService.add();
        studentService.add(3);
        studentService.delete();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans02.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");
//        studentService.add();
        studentService.add(3);
//        studentService.delete();
    }
}
