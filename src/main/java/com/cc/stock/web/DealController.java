package com.cc.stock.web;

import com.cc.stock.dto.Result;
import com.cc.stock.entity.Deal;
import com.cc.stock.entity.User;
import com.cc.stock.service.DealService;
import com.cc.stock.util.CheckLogin;
import com.cc.stock.util.LinkedMultiValueMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/deal")
public class DealController {

    @Autowired
    private DealService dealService;

    CheckLogin checkLogin = new CheckLogin();

    @RequestMapping(value = "/history" ,method = RequestMethod.GET)
    @ResponseBody
    public Result<List> getHistroyDeal(HttpSession session){
        checkLogin.checkLogin(session);
        User user;
        user =(User)session.getAttribute("user");
        int userId = user.getId();
        List<Deal> list = dealService.findHistoryById(userId);
        try {
            return  new Result<List> ("历史交易记录",list);
        }catch (Exception e){
            e.printStackTrace();
            return new Result<List>(201, e.toString() + e.getMessage());
        }

    }

    @RequestMapping(value = "/getDeal",method = RequestMethod.GET)
    @ResponseBody
    public Result<Map> getPosition(HttpSession session){
        checkLogin.checkLogin(session);
        User user ;
        user = (User) session.getAttribute("user");
        int userId = user.getId();
        HashMap hashMap = new HashMap();
        hashMap = dealService.getDealTest(userId);
        return new Result<Map>("持仓信息",hashMap);
    }

}
