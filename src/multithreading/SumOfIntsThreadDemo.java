package multithreading;

public class SumOfIntsThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        long result = 0;
        SumThread thread1 = new SumThread(startTime, 0, Integer.MAX_VALUE/2);
        SumThread thread2 = new SumThread(startTime, (Integer.MAX_VALUE/2)+1, Integer.MAX_VALUE);
        thread1.start();
        thread2.start();
        thread1.join(); //to make main thread wait for the threads to complete their business logic
        thread2.join();
        result = thread1.getResult();
        System.out.println(result);
        result = thread2.getResult();
        System.out.println(result);
        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken by multiple thread Java class is: " + (endTime - startTime));

        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
