package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticOperationsBFR {
    public static void main(String[] args) throws IOException {

        // Declare the object of BufferedReader
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);

        System.out.println("Welcome to Arithmetic Operations using BufferedReader!");
        System.out.print("Please enter the first number: ");

        // Accept first number num1 here
        String input1 = bf.readLine();
        int num1 = Integer.parseInt(input1);

        System.out.print("Please enter the second number: ");

        // Accept first number num2 here
        String input2 = bf.readLine();
        int num2 = Integer.parseInt(input2);

        System.out.println("Which operation would you like to perform?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1/2/3/4): ");

        // Accept Arithmetic operation choice here and perform the corresponding
        String choice = bf.readLine();
        int result;
        if(choice.equals("1")) {
            result = num1 + num2;
        } else if (choice.equals("2")) {
            result = num1 - num2;
        } else if (choice.equals("3")) {
            result = num1 * num2;
        } else {
            result = num1 / num2;
        }
        bf.close();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(result);
        //make numbers double, optimize code and use switch statement: can't divide by zero



    }

}
