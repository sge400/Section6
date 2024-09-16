package wrapper;

public class UnboxingDemo {

    public static void main(String[] args) {

        int num = 16;
        //Boxing
        Integer integer1 = Integer.valueOf(num);
        Double doubleObject1 = Double.valueOf("3.14");
        Long longObject1 = Long.valueOf("95657");


        //Unboxing
        int num1 = integer1.intValue();
        double num2 = doubleObject1.doubleValue();
        long num3 = longObject1.longValue();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
