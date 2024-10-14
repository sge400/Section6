package multithreading;

public class ThreadDemo {

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start(); //can be started at most once!
        //thread.start(); //IllegalThreadStateException

        //second approach
        Thread thread1 = new Thread(()-> System.out.println("Hello from Java Thread"));
        thread1.start(); //.run() will run sequentially

        //third approach
        Runnable runnable = () -> System.out.println("Hi from Java Thread");
        Thread thread2 = new Thread(runnable);
        thread2.start();

        HelloThread thread3 = new HelloThread(); //extends Thread class
        thread3.start();

        Thread thread4 = new Thread(new HelloThread1()); //implements runnable interface
        thread4.start();

        Thread thread5 = new Thread(Hello::sayHello); //by using method reference
        thread5.start();

        System.out.println("Hello from Main Thread");
    }
}
