package com.cn.itcast.ChainofResponsibility;

/**
 * Created by LJP on 2019/4/21.
 */
public class ConcreteHandler3 extends Handler{

    @Override
    public void HandleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println(this.getClass().getSimpleName() + "---" + request);
        } else {
            System.out.println("该数字无法处理" + "---" + request);
        }
    }
}
