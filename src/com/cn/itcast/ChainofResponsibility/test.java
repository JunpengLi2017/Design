package com.cn.itcast.ChainofResponsibility;

/**
 * Created by LJP on 2019/4/21.
 */
public class test {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2,3,5,11,20,1,35,28};
        for (int i = 0; i < requests.length; i++) {
            h1.HandleRequest(requests[i]);
        }
        System.out.println("执行结束");
    }
}
