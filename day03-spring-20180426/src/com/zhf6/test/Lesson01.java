package com.zhf6.test;

import com.zhf6.model.User;
import com.zhf6.web.action.UserAction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson01 {

    @Test
    public void test() throws Exception {

       //注解的使用
        //web开发流程 action -> service -> dao
        ApplicationContext context = new ClassPathXmlApplicationContext("beans01.xml");

        //获取action
        UserAction userAction =  context.getBean(UserAction.class);
        //添加用户
        User user = new User();
        user.setUsername("zhf6");
        user.setPassword("1234");
        userAction.save(user);

        UserAction userAction2 =  context.getBean(UserAction.class);
        System.out.println(userAction);
        System.out.println(userAction2);

        //关闭容器
        context.getClass().getMethod("close").invoke(context);
    }
}
