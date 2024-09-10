package exception;

import java.util.Scanner;

public class TryWithResourcesDemo {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){ //scanner is implicitly final
            System.out.println("Enter a number...");
            int number = scanner.nextInt();
            System.out.println(number);
            //scanner.close(); //will not be executed in case of an exception and your connection will never be closed
        } catch (Exception ex) {
            System.out.println("Please provide input in numerical format only and try again...");
            //no finally block needed, try with resources takes care of closing the connection

        }
    }


}
