package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class StreamReduceOperationDemo {

    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        System.out.println(departmentList.stream().count());

        List<Integer> numbers = List.of(1,2,3,4,5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        int result = numbers.stream().mapToInt(num -> num).sum();
        System.out.println(result);

        int resultEven = numbers.stream().filter(num -> num%2==0).mapToInt(num -> num).sum();
        System.out.println(resultEven);

        OptionalInt result1 =numbers.stream().filter(num -> num%2==0).mapToInt(num -> num).max(); //maximum even number
        System.out.println(result1.getAsInt());
    }
}
