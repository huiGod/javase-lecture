package com.huigod.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class DynamicSubject implements InvocationHandler {

  private Object sub;

  public DynamicSubject(Object sub) {
    this.sub = sub;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("before calling: " + method);

    if (args != null) {
      Arrays.stream(args).forEach(System.out::println);
      args[0] = (int) args[0] + 1;
      args[1] = args[1].toString() + " append";
    }
    method.invoke(sub, args);

    System.out.println("after calling: " + method);

    return null;
  }
}
