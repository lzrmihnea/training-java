package ro.training.java.c20.concurrency;

public class DemoMain {
    public static void main(String[] args) {
        ExampleThread thread = new ExampleThread();  thread.start();
        thread.interrupt();
    }
}
