package com.cc.stock.dao;


import com.cc.stock.entity.Deal;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface DealOfDao {

    List<Deal> findHistoryById(@Param("user_id") int userId);

}
