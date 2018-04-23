package com.cc.stock.entity;

import java.util.Date;

public class Delegate {

    private int id;
    private int userId;
    private String stockId;
    private double price;
    private int num;
    private int deal;
    private boolean type;
    private Date time;

    public Delegate(int id, int userId, String stockId, double price, int num, int deal, boolean type, Date time) {
        this.id = id;
        this.userId = userId;
        this.stockId = stockId;
        this.price = price;
        this.num = num;
        this.deal = deal;
        this.type = type;
        this.time = time;
    }

    public Delegate() {
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

    public int getDeal() {
        return deal;
    }

    public void setDeal(int deal) {
        this.deal = deal;
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
