package com.cc.stock.dao;

import com.cc.stock.entity.StockQuote;
import com.cc.stock.entity.StockQuoteK;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockQuoteDao {

    //查询每日K线图的数据
    List<StockQuote> findQuoteById(@Param("stock_id") String stockId);

    List<StockQuoteK> findQuotekById(@Param("stock_id") String stockId);
}
