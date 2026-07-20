package concurrencydemo;

import java.security.KeyStore;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ExecutorService;

public class ThreadFactoryExample {
    public static void main(String[] args) {
        // Custom ThreadFactory that names threads "MyThread-1", "MyThread-2", etc.
        ThreadFactory customFactory = new ThreadFactory() {
            private int counter = 1;

            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setName("MyThread-" + counter++);
                t.setDaemon(false); // you can also set daemon or priority here
                return t;
            }
        };

        // Use the custom ThreadFactory with an ExecutorService
        ExecutorService threadPool = Executors.newFixedThreadPool(2, customFactory);

        // Submit tasks
        threadPool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in: " + Thread.currentThread().getName());
            }
        });

        threadPool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in: " + Thread.currentThread().getName());
            }
        });

        threadPool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in: " + Thread.currentThread().getName());
            }
        });

        threadPool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in: " + Thread.currentThread().getName());
            }
        });

        threadPool.shutdown();
    }
}
