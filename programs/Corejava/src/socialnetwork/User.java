package socialnetwork;


public class User {

    static String socialNetworkSiteName = "facebook";
    public String name;
    String country;
    String city;

    int salary;  //4 byte
    int pincode;  //-1032 t0 +1031
    int age;  //-127 to 128
    short houseNumber; //-256 to 255
    String password;
    float profidentBalance ;
    double propertyValue;
    int MY_VALUE= 4;
    char grade ;

    public void setValues(String s1,String cn, String cy,int pn,String pwd){
        this.name= s1;
        this.city = cy;
        this.country = cn;
        this.password = pwd;
        this.pincode= pn;
        String w1 = "hi";

    }

    public void m1() {

        name = "dsdjfjk";
    }




}


// class should be started with Capital
// BankAccount
//variable always small
// method should action what it does
//A to Z , a to z , 0 t0 9 , _, $

// _$Abc98 //valid
// 9name //invalid , i can not start with number
