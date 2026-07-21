package concurrencydemo;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Counter {
    private int value = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock();  // acquire lock
        try {
            value++;
            System.out.println(Thread.currentThread().getName() + " -> " + value);
        } finally {
            lock.unlock();  // always release lock in finally
        }
    }
}

class TaskThread extends Thread {
    private Counter counter;

    TaskThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
        }
    }
}

public class ReentrantLockDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();

        TaskThread t1 = new TaskThread(counter);
        TaskThread t2 = new TaskThread(counter);

        t1.start();
        t2.start();
    }
}
