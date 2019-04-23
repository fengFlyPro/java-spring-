package com.zhf6.test;

import com.zhf6.model.MyBeanFactory;
import com.zhf6.model.Student;
import com.zhf6.service.IUserService;
import com.zhf6.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson04 {

    @Test
    public void test1(){
        IUserService iUserService = MyBeanFactory.createUserService();
        iUserService.addUser(8);
        iUserService.deleteUser();
        iUserService.updateUser();
    }

    @Test
    public void test2(){
        StudentService studentService = MyBeanFactory.createStudentService();
        studentService.add(2);
        studentService.delete();
    }

    @Test
    public void test6(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans06.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");
        studentService.add(66);
        studentService.delete();
    }

}
