package p3;

import p1.Calculator;
import p2.TestCalculator;

public class TestCalculator2 {
    public static void main(String[] args) {
        int a = 40, b = 20;
        TestCalculator tc = new TestCalculator(a, b);
        System.out.println(tc.getGrandTotal());
        Calculator c = new Calculator();
        System.out.println(c.sum(a,b) + c.sub(a,b) + c.mult(a,b) + c.div(a,b));
    }
}
