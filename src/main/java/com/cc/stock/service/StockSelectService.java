package com.cc.stock.service;


import com.cc.stock.entity.Deal;
import com.cc.stock.entity.Stock;

import java.util.List;

public interface StockSelectService {
    void addStock(int user_id, String stock_id);

    Stock checkStock(int user_id, String stock_id);

    void deleteStock(int user_id, String stock_id);

    List<Stock> findById(int user_id);

    List<Deal> findHistoryById(int userId);
}
