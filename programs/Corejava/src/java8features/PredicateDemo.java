package java8features;
import java.util.function.Predicate;
public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<String> hasMounikaInString = str -> str.contains("Mounika");

        System.out.println(hasMounikaInString.test("Fullstack Engineer Mounika Maragonni"));



     Predicate<Integer> isEven = num -> num%2==0;

        System.out.println(isEven.test(20));


    }
}
