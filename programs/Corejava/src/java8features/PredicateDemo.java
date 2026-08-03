package java8features;
import java.util.function.Predicate;
public class PredicateDemo {

    public static void main(String[] args) {

     Predicate<Integer> isEven = num -> num%2==0;

        System.out.println(isEven.test(20));


    }
}
