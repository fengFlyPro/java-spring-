package com.zhf6.dao.impl;

import com.zhf6.dao.IAccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDao extends JdbcDaoSupport implements IAccountDao {
    @Override
    public void out(String outer, Integer money) {
        //转出
        String sql = "UPDATE account SET money = money - ? WHERE username = ?;";
        this.getJdbcTemplate().update(sql, money, outer);
    }

    @Override
    public void in(String inner, Integer money) {
        //转入
        String sql = "UPDATE account SET money = money + ? WHERE username = ?;";
        this.getJdbcTemplate().update(sql, money, inner);
    }

}
