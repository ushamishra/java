package concurrencydemo;

import java.util.concurrent.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

class MyWorker extends Thread {
    private CyclicBarrier barrier;
    private Mounika mounika;

    MyWorker(CyclicBarrier barrier, String name,Mounika mounika) {
        super(name);
        this.barrier = barrier;
        this.mounika = mounika;
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " is doing some work...");
            Thread.sleep((int)(Math.random() * 1000)); // simulate work

            if("WORKER-1".equalsIgnoreCase(Thread.currentThread().getName())){

                this.mounika.setQualified(true);
            }

            if("WORKER-2".equalsIgnoreCase(Thread.currentThread().getName())){

                this.mounika.setCriminalActivity(false);
            }

            if("WORKER-3".equalsIgnoreCase(Thread.currentThread().getName())){

                this.mounika.setHasIndianNationality(true);
            }
            System.out.println(getName() + " reached the barrier");

            barrier.await();

            if("WORKER-1".equalsIgnoreCase(Thread.currentThread().getName())){

                System.out.println("Will book flight ticket for Mounika");
            }

            if("WORKER-2".equalsIgnoreCase(Thread.currentThread().getName())){

                System.out.println("Will do the luggage arrangement/packaging for Mounika");
            }

            if("WORKER-3".equalsIgnoreCase(Thread.currentThread().getName())){

                System.out.println("Will take care of finance requirement for Mounika");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class CyclicBarrierDemo {
    public static void main(String[] args) {
        int numWorkers = 3;
        Mounika  mounika = new Mounika(false,true,false);
        // Barrier action without lambda (using anonymous Runnable)
        CyclicBarrier barrier = new CyclicBarrier(numWorkers, new Runnable() {
            @Override
            public void run() {

                System.out.println("All workers reached the barrier!");

                if(mounika.isQualified() && mounika.isHasIndianNationality() && !mounika.isCriminalActivity())
                    System.out.println(Thread.currentThread().getName() + " has approved Visa for Mounika");

            }
        });

        for (int i = 1; i <= numWorkers; i++) {
            new MyWorker(barrier, "Worker-" + i,mounika).start();
        }
    }
}

