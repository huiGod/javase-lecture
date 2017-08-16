package com.huigod.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {


  public static void main(String[] args) {
    RealSubject realSubject = new RealSubject();

    InvocationHandler handler = new DynamicSubject(realSubject);

    Class<?> classType = handler.getClass();

    Subject subject = (Subject) Proxy
        .newProxyInstance(classType.getClassLoader(), realSubject.getClass().getInterfaces(),
            handler);

    subject.request();
    System.out.println();

    Subject1 subject1 = (Subject1) Proxy
        .newProxyInstance(classType.getClassLoader(), realSubject.getClass().getInterfaces(),
            handler);

    subject1.request1();
    System.out.println();


    Subject2 subject2 = (Subject2) Proxy
        .newProxyInstance(classType.getClassLoader(), realSubject.getClass().getInterfaces(),
            handler);

    subject2.request2(1,"string");

    System.out.println(subject2.getClass());

  }
}
