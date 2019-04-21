package com.cn.itcast.ChainofResponsibility;

/**
 * Created by LJP on 2019/4/21.
 */
public class ConcreteHandler2 extends Handler {

    @Override
    public void HandleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println(this.getClass().getSimpleName() + "---" + request);
        } else if (successor != null){
            successor.HandleRequest(request);
        }
    }
}
