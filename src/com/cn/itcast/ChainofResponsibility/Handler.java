package com.cn.itcast.ChainofResponsibility;

/**
 * Created by LJP on 2019/4/21.
 */
public abstract class Handler {
    /**
     * 具体执行者
     */
    protected Handler successor;

    /**
     * 设置继承者
     * @param successor
     */
    public void setSuccessor (Handler successor) {
        this.successor = successor;
    }

    /**
     * 抽象处理方法
     * @param request
     */
    public abstract void HandleRequest(int request);

}
