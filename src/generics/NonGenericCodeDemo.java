package generics;

public class NonGenericCodeDemo {

    public static void main(String[] args) {
        Pair stringIntPair = new Pair("Hello", 42);
        //stringIntPair.setFirst(16); //drawback: results in ClassCastException
        String myString = (String) stringIntPair.getFirst(); //this is the drawback: a lot of manual (down) casting
        int myInt = (Integer) stringIntPair.getSecond();    //Requires casting
        System.out.println(myString);
        System.out.println(myInt);
    }
}
