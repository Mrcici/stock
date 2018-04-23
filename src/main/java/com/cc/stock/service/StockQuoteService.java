package com.cc.stock.service;

import com.cc.stock.entity.StockQuote;
import com.cc.stock.entity.StockQuoteK;

import java.util.List;

public interface StockQuoteService {
    List<StockQuote> findQuoteById(String stockId);

    List<StockQuoteK> findQuoteKById(String stockId);
}
