package concurrencydemo;

import java.util.concurrent.locks.StampedLock;

class SharedDataBetweenThreads {
    private int value = 0;
    private final StampedLock lock = new StampedLock();

    // Writer method
    public void write(int newValue) {
        long stamp = lock.writeLock(); // exclusive lock // 10.24 PM
        try {
            System.out.println(Thread.currentThread().getName() + " writing " + newValue);
            value = newValue;
            Thread.sleep(300); // simulate work
            System.out.println(Thread.currentThread().getName() + " finished writing");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlockWrite(stamp);
        }
    }

    // Optimistic read method
    public void read() {
        long stamp = lock.tryOptimisticRead(); // non-blocking read  //10.21
        int current = value;



        // validate if a write happened during read
        if (!lock.validate(stamp)) {
            // fall back to full read lock
            stamp = lock.readLock();
            try {
                current = value;
            } finally {
                lock.unlockRead(stamp);
            }
        }
        System.out.println(Thread.currentThread().getName() + " reading " + current);
    }
}

public class StampedLockDemo {
    public static void main(String[] args) {
        SharedDataBetweenThreads data = new SharedDataBetweenThreads();

        // Writer thread
        Thread writer = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                data.write(i);
            }
        }, "Writer");

        // Reader threads
        Thread reader1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                data.read();
            }
        }, "Reader-1");

        Thread reader2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                data.read();
            }
        }, "Reader-2");

        writer.start();
        reader1.start();
        reader2.start();
    }
}

