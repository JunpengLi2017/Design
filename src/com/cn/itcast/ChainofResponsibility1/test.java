package com.cn.itcast.ChainofResponsibility1;

/**
 * 测试类
 * Created by LJP on 2019/4/21.
 */
public class test {
    public static void main(String[] args) {
        //创建管理者类
        Manager commonManager = new CommonManager("张经理");
        Manager majordomo = new Majordomo("王总监");
        Manager generalManager = new GeneralManager("马总经理");
        commonManager.setSuperior(majordomo);
        majordomo.setSuperior(generalManager);

        //创建请求
        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("小李请假");
        request.setNumber(1);
        commonManager.requestApplications(request);

        Request request1 = new Request();
        request1.setRequestType("请假");
        request1.setRequestContent("小李请假");
        request1.setNumber(4);
        commonManager.requestApplications(request1);

        Request request2 = new Request();
        request2.setRequestType("加薪");
        request2.setRequestContent("小李请求加薪");
        request2.setNumber(500);
        commonManager.requestApplications(request2);

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("小李请求加薪");
        request3.setNumber(1000);
        commonManager.requestApplications(request3);

        System.out.println("执行结束");
    }
}
