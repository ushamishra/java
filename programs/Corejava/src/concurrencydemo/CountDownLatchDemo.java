package concurrencydemo;

import java.util.concurrent.CountDownLatch;
class Mounika {

    private boolean isQualified;
    private boolean isCriminalActivity;
    private boolean hasIndianNationality;

    public Mounika(boolean isQualified, boolean isCriminalActivity, boolean hasIndianNationality) {
        this.isQualified = isQualified;
        this.isCriminalActivity = isCriminalActivity;
        this.hasIndianNationality = hasIndianNationality;
    }

    public boolean isQualified() {
        return isQualified;
    }

    public void setQualified(boolean qualified) {
        isQualified = qualified;
    }

    public boolean isCriminalActivity() {
        return isCriminalActivity;
    }

    public void setCriminalActivity(boolean criminalActivity) {
        isCriminalActivity = criminalActivity;
    }

    public boolean isHasIndianNationality() {
        return hasIndianNationality;
    }

    public void setHasIndianNationality(boolean hasIndianNationality) {
        this.hasIndianNationality = hasIndianNationality;
    }
}
public class CountDownLatchDemo {
    public static void main(String args[]) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);
        Mounika  mounika = new Mounika(false,true,false);
        Worker educationVerifier = new Worker(1000,mounika, latch, "WORKER-1");
        Worker criminalBackgroundVerifier = new Worker(4000,mounika, latch, "WORKER-2");
        Worker nationalityVerifier = new Worker(7000, mounika,latch, "WORKER-3");

        educationVerifier.start();
        criminalBackgroundVerifier.start();
        nationalityVerifier.start();

        latch.await();

        if(mounika.isQualified() && mounika.isHasIndianNationality() && !mounika.isCriminalActivity())
            System.out.println(Thread.currentThread().getName() + " has approved Visa for Mounika");
    }
}
class Worker extends Thread {
    private int delay;
    private CountDownLatch latch;
    private  Mounika  mounika;
    private boolean isVerified;



    public Worker(int delay,Mounika mounikaobj, CountDownLatch latch, String name) {
        super(name);
        this.delay = delay;
        this.latch = latch;
        this.mounika = mounikaobj;
    }
    public void run() {
        try {
            Thread.sleep(delay);

            if("WORKER-1".equalsIgnoreCase(Thread.currentThread().getName())){

                this.mounika.setQualified(true);
            }

            if("WORKER-2".equalsIgnoreCase(Thread.currentThread().getName())){

                this.mounika.setCriminalActivity(false);
            }

            if("WORKER-3".equalsIgnoreCase(Thread.currentThread().getName())){

                this.mounika.setHasIndianNationality(true);
            }
            System.out.println(Thread.currentThread().getName() + " finished");
            latch.countDown();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}