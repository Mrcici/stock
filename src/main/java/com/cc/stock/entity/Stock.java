package com.cc.stock.entity;

//自选股的POJO
public class Stock {

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

    private int userId;
    private String  stockId;

    @Override
    public String toString() {
        return "Stock{" +
                "user_id=" + userId +
                ", stock_id='" + stockId + '\'' +
                '}';
    }

    public Stock() {
    }
}
