package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Enter a number...");
            int number = scanner.nextInt();
            System.out.println(number);
            //scanner.close(); //will not be executed in case of an exception and your connection will never be closed
        } catch (Exception ex) {
            System.out.println("Please provide input in numerical format only and try again...");
        } finally {
            System.out.println("finally block is being executed");
            if(scanner != null) {
                scanner.close();
            }
        }

    }
}
