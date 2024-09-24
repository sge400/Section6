package map;

import java.util.*;

public class Exercise {

    public static Map<String,Integer> wordsLength() {

        List<String> words = List.of("apple", "banana", "orange", "grape", "kiwi");

        // Write your code below
        HashMap<String, Integer> fruitMap = new HashMap<>();
        for (String word : words) {
            fruitMap.put(word, word.length());
        }
        Set<String> keys = fruitMap.keySet();
        for(String key : keys) {
            int fruitLength = fruitMap.get(key);
            System.out.println(key + " : " + fruitLength );
        }
        return fruitMap;

    }
}
