package com.huigod.strategy;

public class Environment {
    private Strategy strategy;

    public Environment(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int caculator(int a, int b) {
        return strategy.caculator(a, b);
    }
}
