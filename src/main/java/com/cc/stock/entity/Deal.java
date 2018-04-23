package com.cc.stock.entity;

import java.util.Date;
//交易表数据POJO
public class Deal {

    private int id;
    private int userId;
    private String stockId;
    private double price;
    private int num;
    private boolean type;
    private Date time;

    public Deal() {
    }

    public Deal(int id, int userId, String stockId, double price, int num, boolean type, Date time) {
        this.id = id;
        this.userId = userId;
        this.stockId = stockId;
        this.price = price;
        this.num = num;
        this.type = type;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}
