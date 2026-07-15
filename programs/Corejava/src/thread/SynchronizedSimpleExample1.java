package thread;

public class SynchronizedSimpleExample1 {


    static Integer sharedResource = 0;



    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (sharedResource) {
                    ++sharedResource;
                    System.out.println(sharedResource);
                }

            }
        }, "Thread1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (sharedResource) {
                    ++sharedResource;
                    System.out.println(sharedResource);
                }
            }
        }, "Thread2");

        t1.start();
        t2.start();

    }
}
