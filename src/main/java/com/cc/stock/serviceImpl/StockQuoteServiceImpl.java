package com.cc.stock.serviceImpl;

import com.cc.stock.dao.StockQuoteDao;
import com.cc.stock.entity.StockQuote;
import com.cc.stock.entity.StockQuoteK;
import com.cc.stock.service.StockQuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockQuoteServiceImpl implements StockQuoteService {

    @Autowired
    private StockQuoteDao stockQuoteDao;

    //查找每日K线图的数据
    public List<StockQuote> findQuoteById(String stockId) {
        return stockQuoteDao.findQuoteById(stockId);
    }

    public List<StockQuoteK> findQuoteKById(String stockId) {
        return stockQuoteDao.findQuotekById(stockId);
    }
}
