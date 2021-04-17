package p2;

import p1.Calculator;

public class TestCalculator {
    private int a, b;

    public TestCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double getGrandTotal() {
        Calculator c = new Calculator();
        return c.sum(a, b) + c.sub(a, b) + c.mult(a,b) + c.div(a,b);
    }
}
