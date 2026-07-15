package thread;

class SharedPrinter {
    private int number = 1;
    private final int MAX = 10;

    public synchronized void printOdd() {
        while (number <= MAX) {
            if (number % 2 == 1) {
                System.out.println("OddThread → " + number);
                number++;
                notify(); // wake up the other thread
            } else {
                try {
                    wait(); // wait until it's odd again
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                System.out.println("EvenThread → " + number);
                number++;
                notify(); // wake up the other thread
            } else {
                try {
                    wait(); // wait until it's even again
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();

        Thread t1 = new Thread(new OddTask(printer), "OddThread");
        Thread t2 = new Thread(new EvenTask(printer), "EvenThread");

        t1.start();
        t2.start();
    }
}

class OddTask implements Runnable {
    private SharedPrinter printer;

    OddTask(SharedPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printOdd();
    }
}

class EvenTask implements Runnable {
    private SharedPrinter printer;

    EvenTask(SharedPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printEven();
    }
}
