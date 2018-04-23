package com.cc.stock.service;

import com.cc.stock.entity.User;

public interface UserService {
    User Login(String username,String password);

    User Check(String username);

    void Regist(String username, String password);
}
