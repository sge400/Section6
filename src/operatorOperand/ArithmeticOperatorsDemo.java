package operatorOperand;

public class ArithmeticOperatorsDemo {

    public static void main(String[] args) {
        byte num1;
        byte num2 = 5;
        byte num3 = 3;
        num1 = (byte)(num2 + num3); //all operators are converted to int, so you need to typecast
        num1 = 5 + 3;

        double num4;
        double num5 = 3.14;
        byte num6 = 3;
        num4 = num5 + num6; //if one is double, result will also be double
        System.out.println(num4);
    }
}
