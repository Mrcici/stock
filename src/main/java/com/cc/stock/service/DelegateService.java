package com.cc.stock.service;

import java.util.Date;

public interface DelegateService {
    void addDelegate(int userId, String stockId, double price, int num, int deal, boolean type, Date time);
}
