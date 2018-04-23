package com.cc.stock.dao;

import com.cc.stock.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    /**
     * 查找用户名和密码
     * @param username 登录用户名
     * @param password 密码
     * @return
     */
    User findByUsername(@Param("username") String username,@Param("password") String password);

    User checkByUsername(@Param("username") String username);

    void addUser(@Param("username")String username, @Param("password")String password);
}