package com.cc.stock.serviceImpl;

import com.cc.stock.dao.StockSelectDao;
import com.cc.stock.entity.Deal;
import com.cc.stock.entity.Stock;
import com.cc.stock.service.StockSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockSelectServiceImpl implements StockSelectService {

    @Autowired
    private StockSelectDao stockSelectDao;

    public void addStock(int user_id, String stock_id) {
        stockSelectDao.addStock(user_id,stock_id);
    }

    public Stock checkStock(int user_id, String stock_id) {
        Stock stock = new Stock();
        stock = stockSelectDao.checkById(user_id,stock_id);
        if (stock!=null){
            return  stock;
        }else {
            return null;
        }
    }

    public void deleteStock(int user_id, String stock_id) {
        stockSelectDao.deleteStock(user_id,stock_id);
    }

    public List<Stock> findById(int user_id) {
        return stockSelectDao.findById(user_id);
    }

    public List<Deal> findHistoryById(int userId) {
        return stockSelectDao.findHistoryById(userId);
    }

}
