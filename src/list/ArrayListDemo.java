package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        List<Character> characters = new ArrayList<Character>();
        var doubleNums = new ArrayList<Double>();  //using var no need to repeat code
        List<String> countryNames = new ArrayList<String>(); //because list is an interface
        System.out.println(countryNames.size());
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");
        System.out.println(countryNames);
        countryNames.add(1, "France");
        countryNames.set(4, "Spain");
        countryNames.remove("India");
        String firstCountry = countryNames.getFirst();
        String lastCountry = countryNames.getLast();
        String randomElement = countryNames.get(2);
        List<String> reversedCountryNames = countryNames.reversed(); //new object, so catch in a new variable
        System.out.println(countryNames);
        System.out.println(reversedCountryNames);

    }
}
