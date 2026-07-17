package thread;
class SharedResource {
    static final Object lockA = new Object();
    static final Object lockB = new Object();
}

class Thread1 extends Thread {
    public void run() {
        synchronized (SharedResource.lockA) {
            System.out.println("Thread1: Holding lockA...");

            try { Thread.sleep(100); } catch (InterruptedException e) {}

            System.out.println("Thread1: Waiting for lockB...");
            synchronized (SharedResource.lockB) {
                System.out.println("Thread1: Acquired lockB!");
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        synchronized (SharedResource.lockB) {
            System.out.println("Thread2: Holding lockB...");

            try { Thread.sleep(100); } catch (InterruptedException e) {}

            System.out.println("Thread2: Waiting for lockA...");
            synchronized (SharedResource.lockA) {
                System.out.println("Thread2: Acquired lockA!");
            }
        }
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
