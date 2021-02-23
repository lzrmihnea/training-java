package ro.training.java.c20.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    private AtomicInteger x = new AtomicInteger(0);

    public void increment() {
        x.incrementAndGet();
    }

    public int getValue() {
        return x.get();
    }
}

