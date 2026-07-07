package nestedpackage;

public class A { //outer class

    private int i = 10;
    String str = "abc";

   public  class B { //inner class
        int j = 20;

        public void m1(){
            System.out.println("i  ="+new A().i);
        }
    }
}
