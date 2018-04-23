package com.cc.stock.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface DelegateDao {


    void addDelegate(@Param("user_id") int userId,@Param("stock_id") String stockId,
                     @Param("price")double price, @Param("num")int num,
                     @Param("deal")int deal, @Param("type")boolean type,@Param("time") Date time);
}
