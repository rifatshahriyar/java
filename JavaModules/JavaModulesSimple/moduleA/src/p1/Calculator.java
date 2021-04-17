package p1;

public class Calculator {
    public int sum(int a, int b) {
        return a+b;
    }
    public int sub(int a, int b) {
        return a-b;
    }
    public int mult(int a, int b) {
        return a*b;
    }
    public double div(int a, int b) {
        return b == 0 ? 0 : a / (double) b;
    }
}

