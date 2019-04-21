package com.cn.itcast.ChainofResponsibility1;

/**
 * 请求实体类
 * Created by LJP on 2019/4/21.
 */
public class Request {
    private String requestType;

    private String requestContent;

    private Integer number;

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getRequestType() {
        return requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public Integer getNumber() {
        return number;
    }
}
