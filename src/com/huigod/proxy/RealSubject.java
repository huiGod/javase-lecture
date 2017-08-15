package com.huigod.proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("From real Subject");
    }
}
