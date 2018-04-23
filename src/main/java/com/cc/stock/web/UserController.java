package com.cc.stock.web;

import javax.servlet.http.HttpSession;

import com.cc.stock.dto.Result;
import com.cc.stock.entity.User;
import com.cc.stock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//用户控制类
@Controller
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserService userService;
    User user = new User();

    //登录
    @RequestMapping(value="/login",method=RequestMethod.POST)
    @ResponseBody
    public Result<String> login(@RequestBody User user, HttpSession session) {
        user = userService.Login(user.getUsername(), user.getPassword());
        if (user != null) {
            session.setAttribute("user", user);
                return new Result<>(200,"登录成功！");
        }else {
            return new Result<> (-1,"用户名或者密码错误！");
        }
    }

    //检查是否已经登录
    @RequestMapping(value="/loginCheck",method=RequestMethod.GET)
    @ResponseBody
    public Result<String> loginCheck(HttpSession session) {

        user =(User) session.getAttribute("user");
        if (user==null){
            return new Result<>(-1,"请登录");
        }else
            return new Result<>(200,"可进行其他操作");

    }


    //检查用户名是否可用
    @RequestMapping(value = "/check/{username}",method = RequestMethod.GET)
    @ResponseBody
    public Result<String> Check(@PathVariable("username")String username){
        user = userService.Check(username);
        if (user!=null){
            return new Result<>(-1 ,"用户名已被注册");
        }
        return new Result<>(200 ,"用户名可用");
    }

    //用户注册
    @ResponseBody
    @RequestMapping(value="/regist",method=RequestMethod.POST)
    public Result<String> Regist(@RequestBody User user){
        try {
            userService.Regist(user.getUsername(),user.getPassword());
            return new Result<>(200,"注册成功");
        }catch (Exception e){
            return new Result<>(201, e.toString() + e.getMessage());
        }
    }

    //用户注销
    @RequestMapping("/outLogin")
    @ResponseBody
    public Result<String> outLogin(HttpSession session){
        //通过session.invalidata()方法来注销当前的session
        session.invalidate();
        return new Result<>(200,"注销成功");
    }

}