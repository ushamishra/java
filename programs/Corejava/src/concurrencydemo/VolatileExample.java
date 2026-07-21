package concurrencydemo;

public class VolatileExample {
    // The volatile keyword forces threads to read directly from main memory
    private static volatile boolean sayHello = true;

    public static void main(String[] args) throws InterruptedException {
        // 1. Start a worker thread that spins while sayHello is true
        Thread workerThread = new Thread(new Runnable() {

            @Override
            public void run() {
                long count = 0;
                System.out.println("Worker thread started...");

                while (sayHello) {
                    count++; // Keep busy without doing blocking I/O
                }

                System.out.println("Worker thread stopped. Loop ran " + count + " times.");
            }
        });




        workerThread.start();

        // 2. Let the main thread sleep for 1 second while the worker runs
        Thread.sleep(1000);

        // 3. Change the condition flag
        System.out.println("Main thread is setting sayHello to false...");
        sayHello = false;

        // 4. Wait for the worker thread to safely exit
        workerThread.join();
        System.out.println("Main thread execution complete.");
    }
}


