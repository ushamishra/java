package java8features;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamingDemo {

    public static void main(String[] args) {

        List<Integer> listOfNums = new ArrayList<>();
        for(int i = 1 ;i<= 100 ;i++) {
            listOfNums.add(i);
        }
//        List<Integer> nosOnlyDivisibleBy4 = new ArrayList<>();
//        //count the number which are ivisible by 4
//        // sum of the numbers
//        // product of the numbers
//        for(Integer i :listOfNums){
//            if (i %4 == 0){
//                nosOnlyDivisibleBy4.add(i);
//            }
//
//        }
//        //[4,8,12,16,.....]
//        int sum =0;
//        int product = 1;
//        for(int i :nosOnlyDivisibleBy4) {
//            sum = sum + i;  // 4+8+12
//            product = product * i;//4*8*12
//        }


       List<Integer> all4s= listOfNums.stream()
                .filter(num -> num % 4 == 0).collect(Collectors.toList());

        listOfNums.stream()
                .filter(num -> num % 4 == 0).forEach(System.out::println);


        long sum = listOfNums.stream()
                .filter(num -> num % 4 == 0)
                .reduce(0,Integer::sum);

        System.out.println(sum);

        BigInteger product = listOfNums.stream()
                .filter(num -> num % 4 == 0)
                .map(BigInteger::valueOf)
                .reduce(BigInteger.ONE,BigInteger::multiply);

        System.out.println(product);

    }
}
