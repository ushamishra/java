import abc.ConnectionCreator;
import abc.MyInterface;
import inheritence.Car;
import nestedpackage.A;
import socialnetwork.User;
import socialnetwork.DomainUtility;
import socialnetwork.blog.Blog;

import java.util.*;

public class Main  {
    public static void main(String[] args) {

        String[] strList = {"hello","hi","hello","welcome","hello","hi","hi","welcome", "city"};
        Map<String,Integer> freqMap = new HashMap<String, Integer>();

        for(int i =0; i <  strList.length;i++){
            String key = strList[i];

            if (freqMap.get(key) == null) {
                freqMap.put(key, 1);
            }
            else {
                Integer val = freqMap.get(key);
                freqMap.put(key,val+1);
            }


            }

        System.out.println(freqMap);


        nestedpackage.A objA = new nestedpackage.A ();
        nestedpackage.A.B objB = objA.new B();

        objB.m1();

    }

}
