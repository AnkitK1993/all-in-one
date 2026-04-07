package practice.coreJava.multithreading;

public class ThreadMain {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            ThreadEx threadEx = new ThreadEx();
            threadEx.start();
        }
    }
}
