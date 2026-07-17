package thread;


class SharedHomePrinter {
    // Static synchronized method
    public  synchronized void printMessage(String msg) {
        System.out.println(Thread.currentThread().getName() + " printing: " + msg);
        try {
            Thread.sleep(1000); // simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished printing: " + msg);
    }

    public synchronized void cleanThePrinter() throws InterruptedException {

        System.out.println("cleaning operation done by "+Thread.currentThread().getName());
        System.out.println("before cleaning "+Thread.currentThread().getName() +" went on sleep");
        Thread.currentThread().sleep(1000000);

    }
}

class HomeCleaner extends Thread {

    private SharedHomePrinter printer;
    HomeCleaner(String name,SharedHomePrinter printer){
        super(name);
        this.printer = printer;
    }
    public void run(){
        try {
            printer.cleanThePrinter();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class HomeWorker extends Thread {
    private String message;
    private SharedHomePrinter printer;

    HomeWorker(String message, SharedHomePrinter printer) {
        this.message = message;
        this.printer = printer;
    }

    public void run() {
        printer.printMessage(message);
    }
}
public class ObjectLockDemo {

    public static void main(String[] args) {

        SharedHomePrinter obj = new SharedHomePrinter();
        SharedHomePrinter obj1 = new SharedHomePrinter();
        HomeWorker t1 = new HomeWorker("Hello",obj);
        HomeWorker t2 = new HomeWorker("Welcome",obj);
        HomeWorker t3 = new HomeWorker("How are you?",obj1);
        HomeWorker t4 = new HomeWorker("How are you?",obj1);
        HomeCleaner t5 = new HomeCleaner("Thread 5",obj);
        t1.start();
        t2.start();
        t4.start();
        t4.start();
    }


}
