package com.zhf6.service;

import com.zhf6.dao.IUserDao;
import com.zhf6.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//@Service("myUserService")
public class UserServiceImpl implements IUserService {

    @Autowired //spring会自动注入userDao赋值
    private IUserDao userDao;

    @Override
    public void add(User user) {
        System.out.println("service 添加用户:" + user);
        //调用dao
        userDao.add(user);
    }

    @Override
    public int addUser(int a) {
        System.out.println("添加用户。。。。");
        return a;
    }

    @Override
    public void updateUser() {
        System.out.println("更新用户。。。。");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户。。。。");
    }

    @Override
    public int deleteUser(int id) {
        System.out.println("通过id删除用户");
        return 1;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void add() {
        System.out.println("创建用户...." + name);
    }




    public UserServiceImpl() {
        //System.out.println("UserServiceImpl（）调用了");
    }
}
