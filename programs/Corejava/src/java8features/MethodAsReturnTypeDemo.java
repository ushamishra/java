package java8features;

import java.util.function.BiFunction;
import java.util.function.Function;

class Test2 {

   static BiFunction<String,String,String> m1(String str1,String str2){

        return (a,b) -> a +" "+b;
    }
}
public class MethodAsReturnTypeDemo {

    public static void main(String[] args) {

        BiFunction fnc = Test2.m1("dvd","vfd");


        System.out.println(fnc.apply("cxcv","cvxcvx"));
    }
}
