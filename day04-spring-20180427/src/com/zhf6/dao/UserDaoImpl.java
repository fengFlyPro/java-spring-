package com.zhf6.dao;

import com.zhf6.model.User;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UserDaoImpl extends JdbcDaoSupport implements IUserDao {

    @Override
    public void add(User user) {
        String sql = "INSERT INTO user VALUES(?, ?, ?);";
        Object[] args = new Object[]{user.getId(), user.getUsername(), user.getPassword()};
        this.getJdbcTemplate().update(sql, args);
    }

}
