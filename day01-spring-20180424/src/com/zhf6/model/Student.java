package com.zhf6.model;

import org.springframework.stereotype.Component;

//@Component("stu1")
@Component
public class Student {
    private String username;
    private String password;
    private int age;

    public Student() {
    }

    public Student(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Student(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public Student(String username, String password, int age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + this.username + '\'' +
                ",password='" + this.password + '\'' +
                ",age=" + this.age +
                '}';
    }
}
