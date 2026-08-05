package java8features;

//In java 8 , we can pass method as a input


import collection.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class MethodReferenceDemo {

    public static void main(String[] args) {


        AbcInterface obj = Integer::parseInt; //static method reference

        System.out.println(obj.getIntVal("20"));

        DBOperation dbOper = new DBOperation();

        AbdInterface obj1 = dbOper::getStudents;  //object method reference

        AbeInterface obj2 = String::length;  //instance method reference

        AbfInterface obj3 = User::new;//cnstructor method reference









    }


}
