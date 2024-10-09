package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamCollectOperationsDemo {

    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        List<String> newDepartmentList = departmentList.stream().filter(word -> word.startsWith("S")).collect(Collectors.toList());

        newDepartmentList.stream().forEach(System.out::println); //not a terminal operation because collection, not stream

        long totalCount = departmentList.stream().filter(word -> word.startsWith("S")).collect(Collectors.counting());
        System.out.println(totalCount);

        Set<String> newDepartmentList1 = departmentList.stream().filter(word -> word.startsWith("S")).collect(Collectors.toCollection(TreeSet::new));
        newDepartmentList1.forEach(System.out::println);

    }
}
