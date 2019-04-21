package com.cn.itcast.ChainofResponsibility1;

/**
 * 总经理类
 * Created by LJP on 2019/4/21.
 */
public class GeneralManager extends Manager{

    public GeneralManager (String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假")){
            System.out.println(name + "---" + request.getRequestContent() + "---" + request.getNumber() + ",被批准");
        } else if (request.getRequestType().equals("加薪") && request.getNumber() <= 500) {
            System.out.println(name + "---" + request.getRequestContent() + "---" + request.getNumber() + ",被批准");
        } else if (request.getRequestType().equals("加薪") && request.getNumber() > 500) {
            System.out.println(name + "---" + request.getRequestContent() + "---" + request.getNumber() + ",再说吧");
        }
    }
}
