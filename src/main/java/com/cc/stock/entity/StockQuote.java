package com.cc.stock.entity;

import java.util.Date;

//日周月年K线数据的POJO
public class StockQuote {

    private String stockId;
    private Date time;
    private String open;
    private String clos;
    private String max;
    private String min;
    private String volume;
    private String total;

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClos() {
        return clos;
    }

    public void setClos(String clos) {
        this.clos = clos;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
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

    public StockQuote(String stockId, Date time, String open, String clos, String max, String min, String volume, String total) {
        this.stockId = stockId;
        this.time = time;
        this.open = open;
        this.clos = clos;
        this.max = max;
        this.min = min;
        this.volume = volume;
        this.total = total;
    }

    public StockQuote() {
    }

    @Override
    public String toString() {
        return "StockQuote{" +
                "stockId='" + stockId + '\'' +
                ", time=" + time +
                ", open='" + open + '\'' +
                ", clos='" + clos + '\'' +
                ", max='" + max + '\'' +
                ", min='" + min + '\'' +
                ", volume='" + volume + '\'' +
                ", total='" + total + '\'' +
                '}';
    }
}
