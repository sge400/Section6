package list;

import java.util.*;

public class SortingDemo {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        //adding elements to the ArrayList
        numbers.add(47);
        numbers.add(43);
        numbers.add(67);
        numbers.add(92);
        numbers.add(3);
        numbers.add(-67);
        numbers.add(-2);
        numbers.add(0);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);

        var countries = new ArrayList<String>();
        countries.add("India");
        countries.add("USA");
        countries.add("Japan");
        countries.add("France");
        countries.add("Canada");
        System.out.println(countries);
        countries.sort(Comparator.naturalOrder()); //ascending order
        System.out.println(countries);
        countries.sort(Comparator.reverseOrder());
        System.out.println(countries);
    }
}
