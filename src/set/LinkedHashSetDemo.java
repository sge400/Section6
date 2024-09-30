package set;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        var visitedCountries = new LinkedHashSet<String>();
        visitedCountries.add("India");
        visitedCountries.add("USA");
        visitedCountries.add("Dubai");
        visitedCountries.add("Singapore");
        visitedCountries.add("France");

        for(String visitedCountry : visitedCountries) {
            System.out.println(visitedCountry);
        }

        SequencedSet<String> reversedVisitedCountries = visitedCountries.reversed();
        System.out.println(reversedVisitedCountries);
    }
}
