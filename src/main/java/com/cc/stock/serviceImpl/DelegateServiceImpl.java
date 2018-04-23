package com.cc.stock.serviceImpl;

import com.cc.stock.dao.DelegateDao;
import com.cc.stock.service.DelegateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DelegateServiceImpl implements DelegateService {

    @Autowired
    private DelegateDao delegateDao;


    public void addDelegate(int userId, String stockId, double price, int num, int deal, boolean type, Date time) {
        delegateDao.addDelegate(userId,stockId,price,num,deal,type,time);
    }
}
