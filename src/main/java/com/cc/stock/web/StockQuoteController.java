package com.cc.stock.web;

import com.cc.stock.dto.Result;
import com.cc.stock.entity.StockQuote;
import com.cc.stock.entity.StockQuoteK;
import com.cc.stock.service.StockQuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/stock")
public class StockQuoteController {

    @Autowired
    private StockQuoteService stockQuoteService;

    //获取每日股票的行情，用于画每日K线
    @RequestMapping(value = "/quote/{id}" ,method = RequestMethod.GET)
    @ResponseBody
    public Result<List> getQuote (@PathVariable("id")String stockId){
        List<StockQuote> list = stockQuoteService.findQuoteById(stockId);
        try {
            return new Result<List>("返回成功",list);
        }catch (Exception e){
            e.printStackTrace();
            return new Result<List>(201, e.toString() + e.getMessage());
        }
    }

    //获取每日分时K线的数据
    @RequestMapping(value = "/quoteK/{id}" ,method = RequestMethod.GET)
    @ResponseBody
    public Result<List> getQuoteK(@PathVariable("id")String stockId){

        List<StockQuoteK> list = stockQuoteService.findQuoteKById(stockId);
        try {
            return new Result<List>("返回成功",list);
        }catch (Exception e){
            return new Result<List>(201, e.toString() + e.getMessage());
        }

    }

}
