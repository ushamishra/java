package collection;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

    public static void main(String[] args) {


        Student st1 = new Student(1,"Mounika", "5th",'C');
        Student st2 = new Student(2,"Usha", "5th",'B');
        Student st3 = new Student(3,"Ram", "6th",'D');
        Student st4 = new Student(4,"Hari", "10th",'A');
        Student st5 = new Student(5,"Ajay", "10th",'A');


        Map<Integer,Student> studentMap = new Hashtable<>();


        studentMap.put(st1.getRollNo(),st1);
        studentMap.put(st2.getRollNo(),st2);
        studentMap.put(st3.getRollNo(),st3);
        studentMap.put(st4.getRollNo(),st4);
        studentMap.put(null,st5);

        Student st = studentMap.get(2);

        System.out.println(st.toString());


        Map<String ,String> fruitMap =new HashMap<>();

        fruitMap.put("fruit1","Apple");
        fruitMap.put("fruit1","Bannana");
        fruitMap.put("fruit2","Orange");
        fruitMap.put("fruit2","watermelon");

        System.out.println("FruitMap  "+fruitMap);

        System.out.println(studentMap);









    }
}
