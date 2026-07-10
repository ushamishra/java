package exceptiondemo;

import java.util.ArrayList;
import java.util.List;

//java ExceptionDemo //call the classloadeder will load the byte code
public class ExceptionDemo {

    public void m1(){

    }

    public static void main(String[] args) {




      try {


         List<Integer> numList = new ArrayList<Integer>();
         //connect to dB

          //fetch empid , 100,202,null,348,456
         numList.add(100);
         numList.add(202);
         numList.add(null);
         numList.add(348);
         numList.add(456);

          for (Integer num : numList) {

              if(num != null)
              System.out.println(num.toString());
          }
      }catch(ArithmeticException e){
          System.out.println(e);
      }catch (ArrayIndexOutOfBoundsException e){
          System.out.println(e);
      }catch (Exception e){
          System.out.println(e);

      }


        System.out.println("this is a critical code");




    }
}


//Excption or error  it comes into picture during runtime

//Airthemetic Exception