package Java8featuresInCollection;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8FeaturesDemoOnCollectionDS {


    public static void main(String[] args) {
        List<Integer> listIntObjects = Arrays.asList(12, 34, 67, 12, 90);

        List<Integer> listobjs = List.of(2, 3, 4);
        int sum = listobjs.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);

        listIntObjects.stream().filter(num->num%2==0).reduce(0,(a,b)->a+b);


        List<String> names = Arrays.asList("Usha","UshaRani","P.T Usha","ahs","dwhsjjh","dejhjh");

        names.stream().filter(name->name.contains("Usha")).map(name-> name + " Test").collect(Collectors.toList());
        names.stream().filter(name->name.startsWith("Usha")).map(String::toLowerCase).sorted().forEach(System.out::println);




    }


}
    




