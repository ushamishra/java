package thread;


public class BlockedThreadDemo {


    public static void m1(){
        System.out.println("m1");
    };
    public static  void m2(){
        System.out.println("m2");
    };

    public static void main(String[] args) throws InterruptedException {



        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                BlockedThreadDemo.m1();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                BlockedThreadDemo.m2();
            }
        });


        t1.start();
        t2.start();

        System.out.println("Main thread is about to sleep");
        Thread.sleep(3000);
        System.out.println("Main thread woke up");
    }
}
