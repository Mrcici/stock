package com.cc.stock.dto;

public class Result<T> {
    private int status;
    private String message;
    private T data;

    public Result(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public Result(String message, T data) {
        this.status = 200;
        this.message = message;
        this.data = data;
    }

    public Result(T data) {
        this.status = 200;
        this.message = "some data";
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

