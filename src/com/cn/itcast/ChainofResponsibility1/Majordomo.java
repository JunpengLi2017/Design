package com.cn.itcast.ChainofResponsibility1;

/**
 * 总监类
 * Created by LJP on 2019/4/21.
 */
public class Majordomo extends Manager {

    public Majordomo (String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 5){
            System.out.println(name + "---" + request.getRequestContent() + "---" + request.getNumber() + ",被批准");
        } else if (superior != null) {
            superior.requestApplications(request);
        }
    }
}
