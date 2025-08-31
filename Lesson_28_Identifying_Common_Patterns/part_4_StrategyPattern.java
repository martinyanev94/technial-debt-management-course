interface Strategy {
    int execute(int a, int b);
}

class AdditionStrategy implements Strategy {
    public int execute(int a, int b) {
        return a + b;
    }
}

class SubtractionStrategy implements Strategy {
    public int execute(int a, int b) {
        return a - b;
    }
}

class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}
