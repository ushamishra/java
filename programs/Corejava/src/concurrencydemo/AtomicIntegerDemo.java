package concurrencydemo;
import java.util.concurrent.atomic.AtomicInteger;

class CounterThread extends Thread {

    AtomicInteger counter;

    CounterThread(AtomicInteger counter){
        this.counter = counter;

    }
    @Override
    public void run() {

        // read counter
        //updating counter , counter = counter+1
        //write the counter -> ram


        System.out.println(Thread.currentThread().getName() +" trying to increment");


        counter.incrementAndGet();

        System.out.println(Thread.currentThread().getName() +" incremneted to "+counter);
    }
}
public class AtomicIntegerDemo {

    public static void main(String[] args) {

//        ReentrantLock lock = new ReentrantLock();
        AtomicInteger counter = new AtomicInteger(20);

        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);

        t1.start();
        t2.start();






    }


}
