package com.zhf6.dao;

public interface IAccountDao {
    //转出
    public void out(String outer, Integer money);

    //转入
    public void in(String inner, Integer money);
}
