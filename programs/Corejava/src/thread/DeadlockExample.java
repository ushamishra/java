package thread;
class SharedResource {
    static final Object object1 = new Object();
    static final Object object2 = new Object();
}

class Thread1 extends Thread {
    public void run() {
        synchronized (SharedResource.object1) {
            System.out.println("Thread1: Holding object1...");

            try { Thread.sleep(100); } catch (InterruptedException e) {}

            System.out.println("Thread1: Waiting for object2...");
            synchronized (SharedResource.object2) {
                System.out.println("Thread1: Acquired lockB!");
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        synchronized (SharedResource.object2) {
            System.out.println("Thread2: Holding object2...");

            try { Thread.sleep(100); } catch (InterruptedException e) {}

            System.out.println("Thread2: Waiting for object1...");
            synchronized (SharedResource.object1) {
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
