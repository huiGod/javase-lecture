package com.huigod.strategy;

public class Client {
    public static void main(String[] args) {
        AddStrategy addStrategy = new AddStrategy();

        Environment environment = new Environment(addStrategy);

        System.out.println(environment.caculator(3, 4));

        SubtractStrategy subtractStrategy = new SubtractStrategy();

        environment.setStrategy(subtractStrategy);

        System.out.println(environment.caculator(3, 4));
    }
}
