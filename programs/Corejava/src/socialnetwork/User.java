package socialnetwork;


public class User {


   //default constructor provided by compiler
    public User(){

    }
    //parameterized constructor
    public User(String s1,String cn, String cy,int pn,String pwd){
        this.name= s1;
        this.city = cy;
        this.country = cn;
        this.password = pwd;
        this.pincode= pn;
    }

    public User(String s1,String cn){
        this.name= s1;
        this.country = cn;
    }

    public User(String s1,String cn,String cy){
        this.name= s1;
        this.country = cn;
        this.city = cy;
    }

    static String socialNetworkSiteName = "facebook";
    private String name;
    private String country;
    private String city;

    private int salary;  //4 byte
    private int pincode;  //-1032 t0 +1031
    private int age;  //-127 to 128
    private short houseNumber; //-256 to 255
    private String password;
    private float profidentBalance ;
    private double propertyValue;
    int MY_VALUE= 4;
    private char grade ;

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
        country = "jjk";
        city = "sjahs";
    }


    public static String getSocialNetworkSiteName() {
        return socialNetworkSiteName;
    }

    public static void setSocialNetworkSiteName(String socialNetworkSiteName) {
        User.socialNetworkSiteName = socialNetworkSiteName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public short getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(short houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getProfidentBalance() {
        return profidentBalance;
    }

    public void setProfidentBalance(float profidentBalance) {
        this.profidentBalance = profidentBalance;
    }

    public double getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(double propertyValue) {
        this.propertyValue = propertyValue;
    }

    public int getMY_VALUE() {
        return MY_VALUE;
    }

    public void setMY_VALUE(int MY_VALUE) {
        this.MY_VALUE = MY_VALUE;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}


// class should be started with Capital
// BankAccount
//variable always small
// method should action what it does
//A to Z , a to z , 0 t0 9 , _, $

// _$Abc98 //valid
// 9name //invalid , i can not start with number
