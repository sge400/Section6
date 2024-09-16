package wrapper;

public class BoxingDemo {

    public static void main(String[] args) {
        int num = 16;

        //Approach 1 - With the help of Constructor
        Integer integer = new Integer(num); //deprecated from Java 9
        Double doubleObject = new Double(3.14);
        Long longObject = new Long("95657");

        //Approach 2 - With the help of valueOf() --> Boxing
        Integer integer1 = Integer.valueOf(num);
        Double doubleObject1 = Double.valueOf("3.14");
        Long longObject1 = Long.valueOf("95657");

        //Parsing
        int num1 = Integer.parseInt("18");
        System.out.println(num1);
    }
}
