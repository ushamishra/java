package concurrencydemo;

import java.util.concurrent.Semaphore;

class CompanyWorker extends Thread {
    private Semaphore semaphore;

    CompanyWorker(Semaphore semaphore, String name) {
        super(name);
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " waiting for permit...");
            semaphore.acquire();  // acquire a permit
            System.out.println(getName() + " got permit and is working...");
            Thread.sleep(1000);   // simulate work
            System.out.println(getName() + " releasing permit");
            semaphore.release();  // release permit
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SemaphoreDemo {
    public static void main(String[] args) {
        // Only 2 permits available
        Semaphore semaphore = new Semaphore(3);

        // 5 workers competing for 2 permits
        for (int i = 1; i <= 9; i++) {
            new CompanyWorker(semaphore, "Worker-" + i).start();
        }
    }
}
