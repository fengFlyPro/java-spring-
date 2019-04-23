package com.zhf6.service;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentService {

    //相当于一个公共切入点
    @Pointcut
    public void myCutPoint(){}

    public int add(int a){
        System.out.println("add学生");
        return a;
    }

    public void add(){
        System.out.println("add学生");
//        System.out.println(1/0);
    }

    public void delete(){
        System.out.println("删除学生");
    }

    public void update(){
        System.out.println("update学生");
    }
}
