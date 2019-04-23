package com.zhf6.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class User{

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        //System.out.println("2.赋值属性:" + username);
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
        //System.out.println("1.实例化....");
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
