package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise {

    public static Set<String> removeVowelWords () {

        // Write your code below
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lynx");
        fruits.add("grape");
        System.out.println(fruits);

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            //to use the regex as below, use matches as contains won't work
            //what is the difference when you use contains with for-each loop? You get an exception, why?
            if(fruit.matches(".*[aeiouAEIOU].*")) {
                iterator.remove();
            }
        }

        return fruits;

    }
}
