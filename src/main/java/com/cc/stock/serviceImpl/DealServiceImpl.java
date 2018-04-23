package com.cc.stock.serviceImpl;

import com.cc.stock.dao.DealOfDao;
import com.cc.stock.entity.Deal;
import com.cc.stock.entity.HavaPosition;
import com.cc.stock.service.DealService;
import com.cc.stock.util.LinkedMultiValueMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class DealServiceImpl implements DealService {

    @Autowired
    private DealOfDao dealOfDao;

    public List<Deal> findHistoryById(int userId) {
        return dealOfDao.findHistoryById(userId);
    }

    @Override
    public HashMap getDealTest(int userId) {
        HashMap<String ,HashMap<String,Object>> hashMap = new HashMap<String ,HashMap<String,Object>>();
        Deal deal = new Deal();
        List<Deal> list = dealOfDao.findHistoryById(userId);
        for (int i = 0;i<list.size();i++){
            HashMap<String,Object> inmap = new HashMap<>();
            deal = list.get(i);
            if (!hashMap.containsKey(deal.getStockId())){
                if (deal.isType()==true){
                    inmap.put("price",deal.getPrice());
                    inmap.put("num",deal.getNum());
                    hashMap.put(deal.getStockId(),inmap);
                }
            }else {
                inmap = hashMap.get(deal.getStockId());
                if (deal.isType()){
                    try {
                        int ex_num =(int) inmap.get("num");
                        double ex_price = (double) inmap.get("price");
                        int num = (deal.getNum()+ex_num)/2;
                        double price = (ex_price*ex_num+deal.getPrice()*deal.getNum())/num;
                        inmap.put("price",price);
                        inmap.put("num",num);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }else {
                    try {
                        int ex_num = (int)inmap.get("num");
                        int num = ex_num - deal.getNum();
                        double price =(double) inmap.get("price");
                        double dealEnd = deal.getNum()*deal.getPrice();
                        inmap.put("price",price);
                        inmap.put("num",num);
                        inmap.put("dealEnd",dealEnd);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
            hashMap.put(deal.getStockId(),inmap);
        }
        return hashMap;
    }
}
