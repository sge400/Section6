package classes.methods.fields.constructors;

public class ArithmeticOperations {

    double piValue = 3.14;
    static final double PI_VALUE = 3.14;

    public static void main(String[] args) {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        int result = arithmeticOperations.sum(20,5);
        int result1 = addition(20, 5);
        System.out.println(result);
        System.out.println(PI_VALUE);
        System.out.println(arithmeticOperations.piValue);
    }

    public int sum(int num1, int num2) {
        subtract(num1, num2);
        addition(num1, num2);
        int result = num1 + num2;
        return result;
    }

    public int subtract(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static int addition(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

}
