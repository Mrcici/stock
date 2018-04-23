package com.cc.stock.entity;

public class HavaPosition {

    private double price;
    private int num;
    private double endPrice;

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

    public double getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(double endPrice) {
        this.endPrice = endPrice;
    }

    public HavaPosition(double price, int num, double endPrice) {
        this.price = price;
        this.num = num;
        this.endPrice = endPrice;
    }

    public HavaPosition() {
    }

    @Override
    public String toString() {
        return "HavaPosition{" +
                "price=" + price +
                ", num=" + num +
                ", endPrice=" + endPrice +
                '}';
    }
}
