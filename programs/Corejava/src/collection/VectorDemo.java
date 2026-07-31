package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        List<String> strVector = new Vector<>();
        strVector.add("Apple");
        strVector.add("Orange");
        strVector.add("Banana");
        strVector.add("Mango");
        strVector.add("Apple");
        strVector.add("Watermelon");
        strVector.add("Apple");

        for(String str :strVector){

            System.out.println(str);
        }


        System.out.println(strVector.size());
        System.out.println(strVector.get(0));
        System.out.println(strVector.remove("Apple"));

        System.out.println(strVector.size());


    }
}
