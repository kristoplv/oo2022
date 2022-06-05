public abstract class Operation {
    private final String title;
    Operation(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    abstract double operate(double a, double b);

    static class OpAdd extends Operation {
        OpAdd() {
            super("+");
        }
        double operate(double a, double b) {
            return a + b;
        }
    }
    static class OpSub extends Operation {
        OpSub() {
            super("-");
        }
        double operate(double a, double b) {
            return a - b;
        }
    }
    static class OpMul extends Operation {
        OpMul() {
            super("*");
        }
        double operate(double a, double b) {
            return a * b;
        }
    }
    static class OpDiv extends Operation {
        OpDiv() {
            super("/");
        }
        double operate(double a, double b) {
            return Math.round(a / b*100.0)/100.0;
        }
    }
}

