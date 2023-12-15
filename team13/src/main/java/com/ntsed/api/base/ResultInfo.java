package com.ntsed.api.base;



import java.io.Serializable;

public class ResultInfo<T> implements Serializable {
//    查询到的数据
    protected T result;
//    接口提示状态码
    protected int apiCode;
//    接口提示信息
    protected String message;

    public ResultInfo() {
        this.apiCode = 200;
        this.message = "";
    }

    public ResultInfo(int apiCode, String message) {
        this.apiCode = apiCode;
        this.message = message;
    }

    public T getResult() {
        return this.result;
    }

    public ResultInfo<T> setResult(T result) {
        this.result = result;
        return this;
    }

    public int getApiCode() {
        return this.apiCode;
    }

    public void setApiCode(int apiCode) {
        this.apiCode = apiCode;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
