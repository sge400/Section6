package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class IncrementList {

    public static void main(String[] args) {
        List<Integer> newList = Arrays.asList(1,2,3,4);
        System.out.println(incrementList(newList, 3));
    }

    public static List<Integer> incrementList(List<Integer> numbers, int incrementValue) {

        // Define a lambda expression using the UnaryOperator functional interface
        UnaryOperator<Integer> incrementFunction = number -> number + incrementValue;

        // Apply the lambda expression to each integer in the list
        List<Integer> incrementedList = new ArrayList<>();

        for(int number : numbers) {
            incrementedList.add(incrementFunction.apply(number));
        }
        return incrementedList;

    }
}
