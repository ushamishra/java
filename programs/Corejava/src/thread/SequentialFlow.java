package thread;

import java.time.Duration;
import java.time.Instant;

public class SequentialFlow {

    public static void main(String[] args) {
//        System.out.println("read data from a file and write it  file f1");
//        System.out.println("read data from internet and  write it  file f2");
//        System.out.println("read data from database and write it  file f3");

        Instant start = Instant.now();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1 ; i <= 3333333; i++){

                    System.out.println(i);

                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 3333334 ; i <= 6666666; i++){

                    System.out.println(i);

                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 6666667; i <= 10000000; i++){

                    System.out.println(i);

                }
            }
        });



        t1.start();
        t2.start();
        t3.start();


        Instant end = Instant.now();

        Duration duration = Duration.between(start,end);

        System.out.println("Time consumed :: " + duration.getSeconds() +" seconds");
    }
}
