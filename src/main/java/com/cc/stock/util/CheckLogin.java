package com.cc.stock.util;

import com.cc.stock.dto.Result;
import com.cc.stock.entity.User;

import javax.servlet.http.HttpSession;

public class CheckLogin {
    public Result<String> checkLogin(HttpSession session){
        User user;
        user = (User) session.getAttribute("user");
        if (user==null){
            return new Result<>(203,"用户还没登录！");
        }else
            return new Result<>(200,"已登录！");
    }
}
