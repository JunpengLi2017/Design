package com.cn.itcast.ChainofResponsibility;

/**
 * Created by LJP on 2019/4/21.
 */
public class ConcreteHandler1 extends Handler {

    /**
     *
     * @param request
     */
    @Override
    public void HandleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println(this.getClass().getSimpleName() + "---" + request);
        } else if (successor != null){
            successor.HandleRequest(request);
        }
    }
}
