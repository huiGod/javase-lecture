package com.huigod.dynamicproxy;

public class RealSubject implements Subject, Subject1, Subject2 {

  @Override
  public void request() {
    System.out.println("From real subject!");
  }

  @Override
  public void request1() {
    System.out.println("From real subject1!");
  }

  @Override
  public void request2(int param1, String param2) {
    System.out.println("From real subject2! param1: " + param1 + ",param2:" + param2);
  }
}
