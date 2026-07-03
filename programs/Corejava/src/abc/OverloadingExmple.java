package abc;

public class OverloadingExmple {

    public int m1(){

        return 8;
    }

    public float m1(float s1){
        return s1;
    }

    public void m1(String s1){

        System.out.println("my string "+s1);

    }

    public void m1(String s1,String s2){

        System.out.println("my string "+s1 + " "+s2);

    }
//javac OverloadingExample.java  -> .class

    //java OverloadingExample "hel" "gfdg"

    // OverloadingExample.main(args)

    public static void main(String[] args) {

        OverloadingExmple oe = new OverloadingExmple();
        oe.m1();
        oe.m1("hello","hi");
        oe.m1("namaste");
        oe.m1(20.3f);
    }
}

