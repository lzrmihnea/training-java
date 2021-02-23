package ro.training.java.c20.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    private Lock lock = new ReentrantLock();
    private int x = 0;

    public void increment() {
        lock.lock();
        try {
            x++;
        } finally {
            lock.unlock();
        }
    }
}
