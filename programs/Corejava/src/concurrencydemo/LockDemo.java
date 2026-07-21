package concurrencydemo;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

class CounterThread extends Thread {

    AtomicInteger counter;
    ReentrantLock lock ;
    CounterThread(AtomicInteger counter, ReentrantLock lock){
        this.counter = counter;
        this.lock = lock;
    }
    @Override
    public void run() {

        // read counter
        //updating counter , counter = counter+1
        //write the counter -> ram


        System.out.println(Thread.currentThread().getName() +" trying to increment");
        lock.lock();

        counter.incrementAndGet();

        lock.unlock();
        System.out.println(Thread.currentThread().getName() +" incremneted to "+counter);
    }
}
public class LockDemo {

    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();
        AtomicInteger counter = new AtomicInteger(20);

        CounterThread t1 = new CounterThread(counter,lock);
        CounterThread t2 = new CounterThread(counter,lock);

        t1.start();
        t2.start();






    }


}
