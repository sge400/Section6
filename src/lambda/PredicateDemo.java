package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> isEven = (num) -> num%2==0;
        System.out.println(isEven.test(16)); //true
        System.out.println(isEven.test(13)); //false

        Predicate<Integer> isGreaterThan50 = num -> num>50;
        System.out.println(isGreaterThan50.test(61)); //true
        System.out.println(isGreaterThan50.test(31)); //false

        //To check if the number is even and greater than 50
        System.out.println(isEven.and(isGreaterThan50).test(62));
        System.out.println(isEven.and(isGreaterThan50).test(63));

        //To check if the number is even or greater than 50
        System.out.println(isEven.or(isGreaterThan50).test(62));

        System.out.println(isEven.negate().test(63)); //true

        Predicate<Integer> isOdd = Predicate.not(isEven);
        System.out.println(isOdd.test(3));

        Predicate<String> checkEquality = Predicate.isEqual("Eazy Bytes");
        System.out.println(checkEquality.test("Madan"));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenList = list.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evenList);



    }
}
