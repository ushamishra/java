package java8features;



public class FunctionalIntefaceDemo {

    public static void main(String[] args) {

        MathOperation add = (a,b)-> a+b;
        MathOperation sub = (a,b)-> a-b;
        MathOperation mul = (a,b)-> a*b;
        MathOperation div = (a,b)-> a/b;

        System.out.println(add.operation(2,3));

    }
}
