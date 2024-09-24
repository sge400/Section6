package generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildCardDemo {

    public static void main(String[] args) {
        addNumbers(new ArrayList<>());
    }

    public static void addNumbers(List<? super Integer> list) {
        for(int i = 0; i < 10; i++) {
            list.add(i);
        }
        //list.add(3.14); //is double, not int or Integer
        System.out.println(list);
    }
}
