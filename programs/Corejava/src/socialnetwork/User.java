package socialnetwork;


public class User {

    public String name;
    String country;
    String city;
    int pincode;
    String password;
    String SOME_CONSTANT = "HELLO";
    int MY_VALUE= 4;

    public void setValues(String s1,String cn, String cy,int pn,String pwd){
        this.name= s1;
        this.city = cy;
        this.country = cn;
        this.password = pwd;
        this.pincode= pn;
    }




}


// class should be started with Capital
// BankAccount
//variable always small
// method should action what it does
//A to Z , a to z , 0 t0 9 , _, $

// _$Abc98 //valid
// 9name //invalid , i can not start with number
