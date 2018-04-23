package com.cc.stock.web;

import com.cc.stock.dto.Result;
import com.cc.stock.entity.Delegate;
import com.cc.stock.entity.User;
import com.cc.stock.service.DelegateService;
import com.cc.stock.util.CheckLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/delegate")
public class DelegateController {

    @Autowired
    private DelegateService delegateService;

    CheckLogin checkLogin = new CheckLogin();
    //买卖交易的委托请求
    @RequestMapping(value = "/buy",method = RequestMethod.POST)
    @ResponseBody
    public Result<String> delegate(@RequestBody Delegate delegate, HttpSession session){
        checkLogin.checkLogin(session);
        User user;
        user = (User) session.getAttribute("user");
        int userId = user.getId();
        try {
            delegateService.addDelegate(userId,delegate.getStockId(),delegate.getPrice()
            ,delegate.getNum(),delegate.getDeal(),delegate.isType(),delegate.getTime());
            return new Result<String>(200,"委托成功！");
        }catch (Exception e){
            return new Result<String>(201, e.toString() + e.getMessage());
        }
    }

}
