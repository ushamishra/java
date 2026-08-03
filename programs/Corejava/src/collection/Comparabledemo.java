package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comparabledemo {

    public static void main(String[] args) {

        Student st1 = new Student(1,"Mounika", "5th",'C',97.67);
        Student st2 = new Student(2,"Usha", "5th",'B',90.56);
        Student st3 = new Student(3,"Ram", "6th",'D',67.23);
        Student st4 = new Student(4,"Hari", "10th",'A',99.56);
        Student st5 = new Student(5,"Ajay", "10th",'A',89.23);

        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);


        System.out.println(studentList);

        Collections.sort(studentList);

        System.out.println(studentList);



    }
}
