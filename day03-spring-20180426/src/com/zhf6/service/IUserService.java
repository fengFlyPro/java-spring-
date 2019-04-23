package com.zhf6.service;

import com.zhf6.model.User;

public interface IUserService {

    public void add();

    public void add(User user);

    //切面编程
    public int addUser(int a);
    public void updateUser();
    public void deleteUser();
    public int deleteUser(int id);
}
