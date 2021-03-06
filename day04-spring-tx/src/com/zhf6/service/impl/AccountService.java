package com.zhf6.service.impl;

import com.zhf6.dao.IAccountDao;
import com.zhf6.service.IAccountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountService implements IAccountService {
    private IAccountDao accountDao;
    private TransactionTemplate transactionTemplate;

    //提供setter方法，让spring注入
    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    @Override
    public void transer(String outer, String inner, Integer money) {
        //通过事务模板执行业务
        this.transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                //转账
                accountDao.out(outer, money);
                transactionStatus.hasSavepoint();
//                int i = 1/0;
                accountDao.in(inner, money);
            }
        });
    }//transer
}
