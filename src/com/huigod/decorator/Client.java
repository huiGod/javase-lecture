package com.huigod.decorator;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteDecorarot2(new ConcreteDecorator1(new ConcreteComponent()));
        component.doSomething();
    }
}
