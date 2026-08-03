package collection;

import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();
        strSet.add("Apple");
        strSet.add("Orange");
        strSet.add("Banana");
        strSet.add("Mango");
        strSet.add("Apple");
        strSet.add("Watermelon");
        strSet.add("Apple");

//        for(String str :strSet){
//
//            System.out.println(str);
//        }






        Iterator<String> itr = strSet.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Banana");
        treeSet.add("Mango");
        treeSet.add("Apple");
        treeSet.add("Watermelon");
        treeSet.add("Apple");


        System.out.println(treeSet);

    }
}
