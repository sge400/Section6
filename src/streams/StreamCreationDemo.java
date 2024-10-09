package streams;

import strings.SubStringDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamCreationDemo {

    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        //Approach 1
        Stream<String> depStream = departmentList.stream();
        //convert to parallel stream
        //depStream.parallel();
        depStream.forEach(System.out::println); //depStream.forEach(department -> System.out.println(department));

        //Approach 2
        Stream<String> inStream = Stream.of("Eazy", "Bytes", "Java");
        inStream.forEach(System.out::println);

        //Parallel stream
        Stream<String> parallelStream = departmentList.parallelStream();
        parallelStream.forEach(System.out::println);

        //Stream from Array Object
        String[] arrayOfWords = {"Eazy", "Bytes"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);

        //Empty stream
        Stream<String> emptyString = Stream.empty();

        //infinite stream of elements
        //Stream.generate(new Random()::nextInt).forEach(System.out::println);
        //Stream.iterate(1, n -> n+1).forEach(System.out::println);
    }
}
