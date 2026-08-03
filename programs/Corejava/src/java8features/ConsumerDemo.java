package java8features;

import java.util.function.Consumer;
public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<String> greetings = name -> System.out.println("Hello "+name);

        greetings.accept("usha");
    }
}
