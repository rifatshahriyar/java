interface MyNumber {
    double getValue();
}

interface NumericTest {
    boolean test(int n);
}

interface NumericFunction {
    int func(int n);
}

interface StringFunction {
    String func(String n);
}

public class TestLambda {
    public static void main(String[] args) {
        MyNumber myNumber;
        myNumber = () -> 102.45;
        System.out.println(myNumber.getValue());
        myNumber = () -> Math.random() * 100;
        System.out.println(myNumber.getValue());
        NumericTest numericTest;
        numericTest = n -> n % 2 == 0;
        System.out.println(numericTest.test(107));
        numericTest = n -> n >= 0;
        System.out.println(numericTest.test(-10));
        NumericFunction factorial;
        factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        };
        System.out.println(factorial.func(8));
        StringFunction stringFunction;
        stringFunction = (n) -> {
            String result = "";
            for (int i = n.length() - 1; i >= 0; i--) {
                result = result + n.charAt(i);
            }
            return result;
        };
        System.out.println(stringFunction.func("hello world"));
    }
}
