package com.zhf6.service.impl;

import com.zhf6.dao.IAccountDao;
import com.zhf6.service.IAccountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountService2 implements IAccountService {
    private IAccountDao accountDao;

    //提供setter方法，让spring注入
    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transer(String outer, String inner, Integer money) {
                //转账
                accountDao.out(outer, money);
                accountDao.in(inner, money);
                //System.out.println(1/0);
    }//transer
}
