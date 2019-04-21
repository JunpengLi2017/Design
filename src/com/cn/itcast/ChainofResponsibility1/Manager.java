package com.cn.itcast.ChainofResponsibility1;

/**
 * Created by LJP on 2019/4/21.
 */
public abstract class Manager {
    protected String name;

    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void requestApplications(Request request);
}
