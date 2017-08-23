package com.huigod.strategy;

public class MultiplyStrategy implements Strategy {
    @Override
    public int caculator(int a, int b) {
        return a * b;
    }
}
