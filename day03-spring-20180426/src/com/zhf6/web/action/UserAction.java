package com.zhf6.web.action;

import com.zhf6.model.User;
import com.zhf6.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class UserAction{

    /**
     * Autowired是根据类型注入值
     * 如果你是一个接口，从容器找接口实现类
     * 如果你就是一个类，就查找类
     */
    @Autowired//spring自动注入userService赋值【用的多】
    //@Qualifier("myUserService")//根据指定的id注入属性【用的比较少】

    //@Resource(name = "myUserService")//等效于前面两行代码【用的比较少】
    private IUserService userService;

    public void save(User user){
        System.out.println("action save方法 ");
        userService.add(user);
    }
}
