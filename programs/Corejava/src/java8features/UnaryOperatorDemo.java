package java8features;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

    public static void main(String[] args) {
        UnaryOperator<Integer> demo = a ->  a*a;

        System.out.println(demo.apply(8));

        System.out.println(UnaryOperator.identity().apply(8));

    }
}
