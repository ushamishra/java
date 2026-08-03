package collection;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        //user table  how many records?


        String[] strArray = new String[7];

        strArray[0]="Apple";
        strArray[1]="Banana";
        strArray[2]="Mango";
        strArray[3]="Apple";
        strArray[4]="Watermelon";
        strArray[5]="Apple";
        strArray[6]="Apple";

        String[] strArray1 ={"Hello","Welcome"};

        Integer[] intArray = new Integer[10];

        float[] fls = {2.9f,8.6f};


        List<Integer> integrLinkedList = new LinkedList<>();


        List<Integer> integrList = new ArrayList<>();
        List<String> strList = new ArrayList<>();
        strList.add("Apple");
        strList.add("Orange");
        strList.add("Banana");
        strList.add("Mango");
        strList.add("Apple");
        strList.add("Watermelon");
        strList.add("Apple");

        strList.add(5,"Pineapple");

        for(String str :strList){

            System.out.println(str);
        }


        System.out.println(strList.size());
        System.out.println(strList.get(0));
        System.out.println(strList.remove("Apple"));

        System.out.println(strList.size());





    }
}
