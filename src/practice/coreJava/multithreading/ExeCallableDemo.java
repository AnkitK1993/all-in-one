package practice.coreJava.multithreading;

import java.util.concurrent.*;

public class ExeCallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Callable<String> callable = () -> {
            System.out.println("Starting the call..");
            Thread.sleep(1000);
            return "Done with call...";
        };

        System.out.println("About to start call..");
        Future<String> future = executorService.submit(callable);

        String result = future.get();
        System.out.println(result);
        executorService.shutdown();
    }
}
