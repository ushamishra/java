package exceptiondemo;


import  exceptiondemo.CheckedExceptionDemo;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class UserDefinedExceptionDemo {

    static int getAge(String birthDateString){
       ;
        LocalDate birthDate = LocalDate.parse(birthDateString);
        LocalDate today = LocalDate.now();

        int ageYears = Period.between(birthDate, today).getYears();
//        System.out.println("Age in years: " + ageYears);
        return ageYears;
    }

    static void giveUrVote(User user){

        System.out.println("User Id:  "+user.getId() + " having name: "+user.getName()
                + " could cast the vote ");
    }
    static void userVoting()  {
        List<User> users = CheckedExceptionDemo.getDBUsers();

        for(User user :users){

            try{
            int ageYrs = getAge(user.getBirthDay());
            if(ageYrs < 18){
                throw new UnderAgeException("Age is below 18");
            }else{
                giveUrVote(user);
            }
            } catch (Exception e) {
                System.out.println("User Id:  "+user.getId() + " having name: "+user.getName()
                        + " could not cast the vote ");
            }

        }
    }

    public static void main(String[] args) {

        userVoting();


    }
}
