package thread;

class SharedOfficePrinter {
    // Static synchronized method
    public static synchronized void printMessage(String msg) {
        System.out.println(Thread.currentThread().getName() + " printing: " + msg);
        try {
            Thread.sleep(1000); // simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished printing: " + msg);
    }

    public synchronized static void cleanThePrinter() throws InterruptedException {

        System.out.println("cleaning operation done by "+Thread.currentThread().getName());
        System.out.println("before cleaning "+Thread.currentThread().getName() +" went on sleep");
        Thread.currentThread().sleep(1000000);

    }
}

class Cleaner extends Thread {

    Cleaner(String name){
        super(name);
    }
    public void run(){
        try {
            SharedOfficePrinter.cleanThePrinter();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Worker extends Thread {
    private String message;

    Worker(String message) {
        this.message = message;
    }

    public void run() {
        SharedOfficePrinter.printMessage(message);
    }
}

public class StaticLockDemo {
    public static void main(String[] args) {
        Worker t1 = new Worker("Hello");
        Worker t2 = new Worker("World");
        Worker t3 = new Worker("Static Locking");
        Cleaner t4 = new Cleaner("Thread 4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
