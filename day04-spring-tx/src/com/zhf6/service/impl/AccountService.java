package com.zhf6.service.impl;

import com.zhf6.dao.IAccountDao;
import com.zhf6.service.IAccountService;

public class AccountService implements IAccountService {
    private IAccountDao accountDao;

    //提供setter方法，让spring注入
    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transer(String outer, String inner, Integer money) {
        //转账
        this.accountDao.out(outer, money);
        this.accountDao.in(inner, money);
    }
}
