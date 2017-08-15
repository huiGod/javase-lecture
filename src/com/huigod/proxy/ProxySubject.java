package com.huigod.proxy;

public class ProxySubject implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {

        this.preRequest();

        if (null == realSubject) {
            realSubject = new RealSubject();
        }

        realSubject.request();

        this.postRequest();
    }

    private void preRequest() {
        System.out.println("pre request");
    }

    private void postRequest() {
        System.out.println("post request");
    }
}
