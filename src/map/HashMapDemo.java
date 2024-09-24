package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    /**
     * does not allow duplicates
     * @param args
     */
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
//        HashMap<String, String> countryMap1 = new HashMap<>();
//        var countryMap2 = new HashMap<String, String>();

        countryMap.put("India", "New Delhi");
        countryMap.put("USA", "Washington, DC");
        countryMap.put("France", "Paris");
        countryMap.put(null, null);

        System.out.println(countryMap.get("India"));
        countryMap.remove(null);
        System.out.println(countryMap.size());

    }
}
