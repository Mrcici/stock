package com.cc.stock.web;

import com.cc.stock.dto.Result;
import com.cc.stock.entity.Deal;
import com.cc.stock.entity.Stock;
import com.cc.stock.entity.User;
import com.cc.stock.service.StockSelectService;
import com.cc.stock.util.CheckLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

//自选股控制类
@Controller
@RequestMapping("/stock")
public class StockSelectController {

    @Autowired
    private StockSelectService stockSelectService;
    User user = new User();
    CheckLogin checkLogin = new CheckLogin();
    //检查股票是否已收藏
    @RequestMapping(value = "/check/{stock_id}",method = RequestMethod.GET)
    @ResponseBody
    public Result<String> checkStock(@PathVariable("stock_id")String stockId ,HttpSession session){

        checkLogin.checkLogin(session);
        user = (User) session.getAttribute("user");
        int userId = user.getId();//这个id没获取出来，
        Stock stock;
        stock = stockSelectService.checkStock(userId,stockId);
        if (stock!=null){
            return new Result<String>(203,"该股票已添加");
        }else {
        return new Result<String>(200,"可添加！");
        }
    }

    //添加自选股
    @RequestMapping(value="/add/{stock_id}",method= RequestMethod.GET)
    @ResponseBody
    public Result<String> addStock(@PathVariable("stock_id") String stockId , HttpSession session){

        checkLogin.checkLogin(session);
        user = (User) session.getAttribute("user");
        int userId = user.getId();
        stockSelectService.addStock(userId,stockId);
        try {
            return new Result<String>(200,"添加成功！");
        }catch (Exception e){
            return new Result<String>(201, e.toString() + e.getMessage());
        }

    }

    //删除自选股
    @RequestMapping(value = "/delete/{stock_id}",method= RequestMethod.GET)
    @ResponseBody
    public Result<String> deleteStrock(@PathVariable("stock_id")String stockId,HttpSession session){

        checkLogin.checkLogin(session);
        user = (User) session.getAttribute("user");
        int userId = user.getId();
        stockSelectService.deleteStock(userId,stockId);
        try {
            return new Result<String>(200,"删除成功！");
        }catch (Exception e){
            return new Result<String>(201, e.toString() + e.getMessage());
        }
    }

    //查询自选股列表
    @RequestMapping(value = "/findById" , method = RequestMethod.GET)
    @ResponseBody
    public Result<List> findById(HttpSession session){
        checkLogin.checkLogin(session);
        user = (User) session.getAttribute("user");
        int userId = user.getId();
        List<Stock> list = stockSelectService.findById(userId);
        try {
            return  new Result<List> ("id为"+userId+"的自选股",list);
        }catch (Exception e){
            e.printStackTrace();
            return new Result<List>(201, e.toString() + e.getMessage());
        }
    }


    @RequestMapping("/history")
    @ResponseBody
    public Result<List> getHistoryDeal(HttpSession session){
        checkLogin.checkLogin(session);
        user = (User) session.getAttribute("user");
        int userId = user.getId();
        try {
            List<Deal> list1 = stockSelectService.findHistoryById(userId);
            return  new Result<List> ("id为"+userId+"的自选股",list1);
        }catch (Exception e){
            e.printStackTrace();
            return new Result<List>(201, e.toString() + e.getMessage());
        }
    }

}
