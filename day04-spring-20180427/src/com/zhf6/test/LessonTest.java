package com.zhf6.test;

import com.zhf6.dao.IUserDao;
import com.zhf6.model.Student;
import com.zhf6.model.User;
import com.zhf6.service.StudentService;
import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Date;

public class LessonTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans01.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");
        studentService.add();
        studentService.add(3);
        studentService.delete();
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans02.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");
//        studentService.add();
        studentService.add(3);
//        studentService.delete();
    }

    @Test
    public void test4() {
        //1、创建数据源
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_db?useUnicode=true&characterEncoding=utf-8");
        dataSource.setUsername("root");
        dataSource.setPassword("111111");
        //2、创建模板
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update("INSERT INTO user VALUES(?, ?, ?);",1,"fengfly","feng~~~");
//        jdbcTemplate.execute("SELECT * FROM ee;");
//        String sql = "INSERT INTO ee(id,name,date,singin) VALUES(7,'fengfly','2019-02-24',12);";
//        jdbcTemplate.update(sql);
    }

    @Test
    public void test66() {
        Date dd = new Date();
        System.out.println(dd.getTime());
        System.out.println(dd.getTime());
        System.out.println(dd.getTime());
    }

    //配置DBCP
    @Test
    public void test5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans05.xml");
        IUserDao userDao = (IUserDao) context.getBean("userDao");
        userDao.add(new User(15,"hhh","ddd"));
    }

    @Test
    public void test6(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans06.xml");
        IUserDao userDao = (IUserDao) context.getBean("userDao");
        userDao.add(new User(199,"hhh","ddd"));
    }

}
