package java8features;

import collection.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBOperation {

    public Map<Integer,Student> getStudents(){

        Map<Integer,Student> studentMap = new HashMap<>();
        Student st1 = new Student(1,"Mounika", "5th",'C',97.67);
        Student st2 = new Student(2,"Usha", "5th",'B',90.56);
        Student st3 = new Student(3,"Ram", "6th",'D',67.23);
        Student st4 = new Student(4,"Hari", "10th",'A',99.56);
        Student st5 = new Student(5,"Ajay", "10th",'A',89.23);

        studentMap.put(st1.getRollNo(),st1);
        studentMap.put(st2.getRollNo(),st2);
        studentMap.put(st3.getRollNo(),st3);
        studentMap.put(st4.getRollNo(),st4);
        studentMap.put(st5.getRollNo(),st5);

        return studentMap;
    }
}
