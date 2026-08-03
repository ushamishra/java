package java8features;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryOperatorDemo {

    public static void main(String[] args) {

        BinaryOperator<Integer> returnMin = (a,b )->   a+b;
        System.out.println(returnMin.apply(2,3));

        UnaryOperator<Integer> un = a  -> a*a;

        System.out.println(returnMin.andThen(un).apply(2,3));

        BinaryOperator<Integer>
                op = BinaryOperator
                .minBy(
                        (a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));


    }
}
