package com.huigod.decorator;

public class ConcreteComponent implements Component {
    @Override
    public void doSomething() {
        System.out.println("具体功能直接实现");
    }
}
