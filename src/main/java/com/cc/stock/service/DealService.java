package com.cc.stock.service;

import com.cc.stock.entity.Deal;
import com.cc.stock.util.LinkedMultiValueMap;

import java.util.HashMap;
import java.util.List;

public interface DealService {
    List<Deal> findHistoryById(int userId);

    HashMap getDealTest(int userId);
}
