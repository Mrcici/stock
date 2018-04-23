package com.cc.stock.entity;

import java.util.Date;

//分时K线数据的POJO
public class StockQuoteK {

    private String stockId;
    private String date;
    private String time;
    private String price;
    private String volume;
    private String total;

    public StockQuoteK(String stockId, String date, String time, String price, String volume, String total) {
        this.stockId = stockId;
        this.date = date;
        this.time = time;
        this.price = price;
        this.volume = volume;
        this.total = total;
    }

    public StockQuoteK() {
    }

    @Override
    public String toString() {
        return "StockQuoteK{" +
                "stockId='" + stockId + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", price='" + price + '\'' +
                ", volume='" + volume + '\'' +
                ", total='" + total + '\'' +
                '}';
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
