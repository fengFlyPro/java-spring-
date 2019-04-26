package com.zhf6.test;

import com.zhf6.dao.IAccountDao;
import com.zhf6.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans06.xml");
        IAccountService accountService = (IAccountService) context.getBean("accountService");
        accountService.transer("jack","rose",200);
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans11.xml");
        IAccountService accountService = (IAccountService) context.getBean("accountService");
        accountService.transer("jack","rose",100);
    }
}
