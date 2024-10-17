package multithreading;

public class SumOfIntsDemo {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        long result = 0;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            result = result + i;
        }
//        SumThread thread1 = new SumThread(0, Integer.MAX_VALUE);
//        thread1.start();
//        thread1.join();

        System.out.println(result);
        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken by normal Java class is: " + (endTime - startTime));


    }

}
