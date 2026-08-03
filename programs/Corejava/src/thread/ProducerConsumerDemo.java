package thread;


import collection.QueueDemo;

import java.util.LinkedList;
import java.util.Queue;

class ProducerAndConsumer {


    private final Queue<Integer> buffer;
    private int CAPACITY;

    ProducerAndConsumer(Queue<Integer> buffer, int CAPACITY) {
        this.buffer = buffer;
        this.CAPACITY = CAPACITY;

    }

    void produce() throws InterruptedException {


        int value = 0;
        while (true) {
            synchronized (this) {

                if (buffer.size() == CAPACITY) {
                    System.out.println("buffer is full");
                    wait();
                }
                value++;
                buffer.add(value);
                System.out.println("Produced " + value);

                notify();


            }
            Thread.currentThread().sleep(3000);
        }

    }

    void consume() throws InterruptedException {


        int value = 0;
        while (true) {
            synchronized (this) {

                if (buffer.isEmpty()) {
                    System.out.println("buffer is empty");
                    wait();
                }
                value = buffer.poll();
                System.out.println("Consumed " + value);

                notify();


            }
        }
    }
}



public class ProducerConsumerDemo {

    private static final int CAPACITY = 5;
    private static final Queue<Integer> buffer = new LinkedList();
    public static void main(String[] args) {
        ProducerAndConsumer pc = new ProducerAndConsumer(buffer,CAPACITY);

        Thread t1 = new Thread(()->{
            try {
                pc.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(()->{
            try {
                pc.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();





    }
}
