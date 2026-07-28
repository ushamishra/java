package concurrencydemo;

import java.util.concurrent.locks.ReentrantReadWriteLock;

class SharedData {
    private int value = 0;
    private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();

    public void write(int newValue) {
        rwLock.writeLock().lock();   // exclusive lock
        try {
            System.out.println(Thread.currentThread().getName() + " writing " + newValue);
            value = newValue;
            Thread.sleep(500); // simulate work
            System.out.println(Thread.currentThread().getName() + " finished writing");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            rwLock.writeLock().unlock();
        }
    }

    public void read() {
        rwLock.readLock().lock();   // shared lock
        try {
            System.out.println(Thread.currentThread().getName() + " reading " + value);
            Thread.sleep(200); // simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            rwLock.readLock().unlock();
        }
    }
}

public class ReadWriteLockDemo {
    public static void main(String[] args) {
        SharedData data = new SharedData();

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

