package abc;


import java.util.Scanner;

public class JavaCOntrolStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter your name");
//        String name = sc.nextLine();
//
//
//        if (name.equals("Mounika")) {
//            System.out.println("Welcome to java class");
//        } else {
//            System.out.println("Please go to python class");
//        }
//
//        if (name.equals("Mounika")) {
//            System.out.println("Welcome to java class");
//        } else if (name.equalsIgnoreCase("Usha")) {
//            System.out.println("Please go to python class");
//        } else {
//            System.out.println("Please do not do anything");
//        }


//        for (int j = 10; j >= 1; j--) {
//            if(j == 5) {
//                break; // permantently the for loop will be aborted, it wil never resume
//            }else {
//                System.out.println(j);
//            }
//        }

//        for (int j = 10; j >= 1; j--) {
//            if(j == 5) {
//                continue; //  for loop will be aborted only for that time/condition, it will resume again,
//            }else {
//                System.out.println(j);
//            }
//        }

      /*  int j = 10;
        while( j >= 1){

            System.out.println(j);
            j--;
        }*/
//        int n;
//        do {
//            System.out.println("I love java");
//            System.out.println("Enter your number");
//             n = sc.nextInt();
//
//        }while(n==5);



        System.out.println("Enter a number between 0 to 6 ");
        int dayOfWeek = sc.nextInt();

        switch (dayOfWeek) {
            case 0:
                System.out.println ("Sunday");
                break;
            case 1:
                System.out.println ("Monday");
                break;
            case 2:
                System.out.println ("Tuesday");
                break;

            case 3:
                System.out.println ("Wednesday");
                break;
            case 4:
                System.out.println ("Thursday");
                break;
            case 5:
                System.out.println ("Friday");
                break;
            case 6:
                System.out.println ("Saturday");
                break;
            default :
                System.out.println ("ERROR!");
        }

        sc.nextLine();
        System.out.println("Enter the week day name");
        String nameOfTheDay = sc.nextLine();


        switch (nameOfTheDay) {
            case "Sunday":
                System.out.println ("Enjoy !!");
                break;
            case "Monday":
                System.out.println ("Oho, back to work!! ");
                break;
            case "Tuesday":
                System.out.println ("I am habituated with office day");
                break;

            case "Wednesday":
                System.out.println("countdown started for weekend !");
                break;
            case "Thursday":
                System.out.println (" 1 more day in office");
                break;
            case "Friday":
                System.out.println("Great day!! ");
                break;
            case "Saturday":
                System.out.println ("Weekend started");
                break;
            default :
                System.out.println ("ERROR!");
        }






    }

}