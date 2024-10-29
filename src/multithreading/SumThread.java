package multithreading;

public class SumThread extends Thread {

    private final long startTime;
    private int startIndex;
    private int endIndex;
    private long result;

    public SumThread(long startTime, int startIndex, int endIndex) {
        this.startTime = startTime;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        System.out.println("Start at: " + (System.currentTimeMillis()-startTime) + " " + Thread.currentThread().getName());
        try {
            for (int i = 0; i < 20; i++) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        for (long i = startIndex; i <= endIndex; i++) {
//            result = result + i;
//        }
        System.out.println("Stop at: " + (System.currentTimeMillis()-startTime) + " " + Thread.currentThread().getName());
    }
    public long getResult(){
        return result;
    }
}
