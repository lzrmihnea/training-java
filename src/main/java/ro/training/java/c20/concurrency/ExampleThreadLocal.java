package ro.training.java.c20.concurrency;

public class ExampleThreadLocal {
    public static class ExampleRunnable implements Runnable {
        private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

        @Override
        public void run() {
            threadLocal.set((int) (Math.random() * 500));
            System.out.println("Thread Local Variable Value : " + threadLocal.get());
        }
    }

    public static void main(String[] args) {
        ExampleRunnable runnable = new ExampleRunnable();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
    }
}
