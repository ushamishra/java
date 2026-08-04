package java8features;

import java.util.function.Consumer;
public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<String> greetings = name -> System.out.println("Hello "+name);



        Consumer<Double> o1 = aDouble -> System.out.println(aDouble * 100);

        Consumer<Double> o2 = doubleval -> System.out.println(doubleval * 2);

        o1.andThen(o2).accept(6.0);


    }
}
