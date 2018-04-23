package com.cc.stock.dao;

import com.cc.stock.entity.Deal;
import com.cc.stock.entity.Stock;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StockSelectDao {

    void addStock(@Param("user_id")int userId,@Param("stock_id") String stock_id);

    Stock checkById(@Param("user_id")int userId,@Param("stock_id")String stock_id);

    void deleteStock(@Param("user_id")int userId,@Param("stock_id") String stock_id);

    List<Stock> findById(@Param("user_id")int userId);

    List<Deal> findHistoryById(@Param("user_id") int userId);
}
