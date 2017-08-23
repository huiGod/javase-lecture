package com.huigod.decorator;

public class ConcreteDecorarot2 extends Decorator {
    public ConcreteDecorarot2(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        this.doAnotherThing();
    }

    private void doAnotherThing() {
        System.out.println("功能B");
    }

    public static void main(String[] args) {
        Integer a = 100;
        Integer b = new Integer(100);
        System.out.println(a.equals(b));
    }
}
