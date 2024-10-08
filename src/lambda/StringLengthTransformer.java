package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StringLengthTransformer {
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("Hello", "Java");
        System.out.println(transformStringLengths(inputList));

    }

    public static List<Integer> transformStringLengths(List<String> strings) {

        // Define a lambda expression using the Function functional interface
        Function<String, Integer> lengthOfString = input -> input.length();

        // Apply the lambda expression to each string in the list
        List<Integer> listOutput = new ArrayList<>();
        for(String string : strings) {
            listOutput.add(lengthOfString.apply(string));
        }
        return listOutput;

    }
}
