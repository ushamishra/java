package java8features;

//In java 8 , we can pass method as a input


import java.util.ArrayList;
import java.util.List;

class DBClass {

     List<String> generateReportCard(DBInterface obj){

         List<String> reportCards = new ArrayList<>();
         return reportCards;
     }

     double generateScore(double val){
         return val*10;
     }
}

public class MethodReferenceDemo {

    public static void main(String[] args) {



        DBClass obj1 = new DBClass();
        obj1.generateReportCard(() -> {
            return (int)(Math.random()*10000);
        });
        

    }


}
