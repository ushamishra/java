package thread;

class NiceClass1{

void m1(){
    System.out.println("a");
}
}

class NiceClass2 extends NiceClass1{
    void m1(){
        System.out.println("b");
    }

}

class NiceClass3 extends NiceClass2 {


}

interface I1{

}

interface I2 {

}


class B1  extends NiceClass3 implements Runnable,Cloneable,I1,I2{


    @Override
    public void run() {
        System.out.println("read data from a file and write it  file f1");
    }
}
//approach 1
class B2 extends Thread{

    @Override
    public void run() {
        System.out.println("read data from internet and  write it  file f2");
    }
}

class B3 extends Thread{

    @Override
    public void run() {
        System.out.println("read data from database and write it  file f3");
    }
}

public class MutltiThreadindDemo1 {

    public static void main(String[] args) {


        Thread b1 = new B1(); // new thread

        Thread b2 = new B2();

        Thread b3 = new B3();


        try {
            b1.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        b2.start();
        b3.start();
        b1.start();


    }
}

