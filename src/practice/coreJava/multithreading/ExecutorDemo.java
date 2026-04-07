package practice.coreJava.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {


    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Inside Run method");
            try {
                Thread.sleep(1000);
                System.out.println("Finished Run method");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 1; i <= 3; i++) {
            executorService.execute(runnable);
        }
        executorService.shutdown();
    }
}
