package bank;

public class BankAccount {
    private int bankAccoountNumber;
    private String accountpwd;
    private double balance;
    private String accountType;

    private final double MIN_BALANCE= 1000.00;



    //no parameter constructor
    public BankAccount(){

    }

    //parametrized constructor
    public BankAccount(int bankAccoountNumber, String accountpwd, double balance, String accountType) {
        this.bankAccoountNumber = bankAccoountNumber;
        this.accountpwd = accountpwd;
        this.balance = balance;
        this.accountType = accountType;
    }

    public int getBankAccoountNumber() {
        return bankAccoountNumber;
    }

    public void setBankAccoountNumber(int bankAccoountNumber) {
        this.bankAccoountNumber = bankAccoountNumber;
    }

    public String getAccountpwd() {
        return accountpwd;
    }

    public void setAccountpwd(String accountpwd) {
        this.accountpwd = accountpwd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }


    public double withdraw(String inputusername,String inputpwd, String accountNo,double amount) {
        // connect to db
        //select username,pwd,balance from User where accountno = {accountNo}
        String dbusername = "mounika";
        String dbpwd = "somepwd123";
        this.balance = 34000;


        double withdrawalAmt = 0;

        //Authenicated and authorised user
        if (inputusername.equals(dbusername) && inputpwd.equals(dbpwd)){
            if (amount < balance)
                withdrawalAmt = amount;
        }
        return withdrawalAmt;

    }

}
