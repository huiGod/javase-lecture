package com.huigod.strategy;

public class DivideStrategy implements Strategy {
    @Override
    public int caculator(int a, int b) {
        return a / b;
    }
}
