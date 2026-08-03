package java8features;


import java.util.function.BiFunction;
import java.util.function.Function;

class Test1{

    int div(int a,int b){
        return a/b;
    }
}
public class FunctionAsAParameterDemo {

    public static Integer calculate(int a, int b, BiFunction<Integer,Integer,Integer> operation){
        return operation.apply(a,b);
    }

    public static Integer add(int a,int b){
        return a+b;
    }

    public static Integer squareOfStrLength(String a, Function<String,Integer> func){
        return func.apply(a);
    }

    public static void main(String[] args) {

        calculate(6,7,FunctionAsAParameterDemo::add);

        calculate(6,7,(a,b)->a*b );

        Test1 obj = new Test1();

        calculate(6,7,obj::div);


        squareOfStrLength("text",String::length);

        squareOfStrLength("ksaj",str->str.length());





    }
}
