package p2;

import p1.Calculator;

public class TestCalculator {
    public static void main(String[] args) {
        int a = 40, b = 30;
        Calculator c = new Calculator();
        System.out.println(c.sum(a,b));
        System.out.println(c.sub(a,b));
        System.out.println(c.mult(a,b));
        System.out.println(c.div(a,b));
    }
}

