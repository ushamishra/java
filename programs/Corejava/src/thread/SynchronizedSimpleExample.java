package thread;

// balance - 50000 - t1 - 10000 deposit  t2 - 7000 withdraw

public class SynchronizedSimpleExample {

    static int sharedResource = 0;
    synchronized static void incrementSharedResource() {
        ++sharedResource;
        System.out.println(sharedResource);
    }


    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                SynchronizedSimpleExample.incrementSharedResource();
            }
        }, "Thread1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizedSimpleExample.incrementSharedResource();
            }
        }, "Thread2");

        t1.start();
        t2.start();

    }
}
