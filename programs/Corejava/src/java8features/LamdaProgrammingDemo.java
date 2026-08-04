package java8features;

class Jhhh implements MyInterface {

    @Override
    public String greet(String fname,String lname) {
        return "Hello "+ fname + lname;
    }
}

public class LamdaProgrammingDemo {

    public static void main(String[] args) {

//        Stage 1
//        Jhhh obj = new Jhhh();
//        obj.greet();

        //        Stage 2
        MyInterface obj = new MyInterface() {
            @Override
            public String greet(String fname,String lname) {
                int a = 5;
                boolean isFlag = true;
                return "hello" +fname +lname;
            }
        };

        //        Stage 3

        MyInterface obj1 = (fname,lname)-> "hello " +fname +" "+lname;



    }
}
