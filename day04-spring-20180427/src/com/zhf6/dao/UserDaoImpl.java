package com.zhf6.dao;

import com.zhf6.model.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class UserDaoImpl implements IUserDao{

    // <bean init-method="" destroy-method=""></bean>
//    @PostConstruct //相当于init-method=""
    public void myInit(){
        System.out.println("UserDaoImpl自定义的初始化方法...");
    }

//    @PreDestroy//相当于destroy-method=""
    public void myDestroy(){
        System.out.println("UserDaoImpl自定义的销毁方法...");
    }
    @Override
    public void add(User user) {
        System.out.println("dao 添加用户:" + user);
    }
}
