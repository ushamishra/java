package thread;



class  B {

    int a;
    byte b;
     void m1(){

    }

     void m2(){

    }
     void m3(){

    }
     void m4(){

    }

}
//approach 2
class A  extends B implements Runnable {

    @Override
    public void run() {

        System.out.println("This if from "+Thread.currentThread().getName());
    }
}
public class ThreadCreationDemoApproach2 {
}
