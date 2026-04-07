package practice.coreJava.multithreading;

public class RunnableMain {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 3; i++) {
            RunnableEx runnableEx = new RunnableEx();
            Thread thread = new Thread(runnableEx);
            thread.start();
            thread.join();
        }
    }
}
