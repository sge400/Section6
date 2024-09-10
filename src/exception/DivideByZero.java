package exception;

import exception.custom.DivideByZeroException;

import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a numerator number value to perform the division: ");
        int numerator = scanner.nextInt();
        System.out.println("Please enter a denominator number value to perform the division: ");
        int denominator = scanner.nextInt();
        if(denominator == 0) {
            throw new DivideByZeroException("Denominator can not be zero");
        }
        int result = numerator/denominator;
        System.out.println(result);
    }
}
