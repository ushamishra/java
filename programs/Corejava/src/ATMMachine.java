import bank.BankAccount;

public class ATMMachine {

    public static void main(String[] args) {


         String inputusername = args[0];
         String pwd = args[1];
         String accountNo = args[2];
         String amt = args[3];

         double  amount = Double.parseDouble(amt);

        BankAccount bankAccount = new BankAccount();

       double witdrawlAmount = bankAccount.withdraw(inputusername,pwd,accountNo,amount);

       if(witdrawlAmount > 0)
        System.out.println("Please take your withdwan money "+witdrawlAmount);
       else
           System.out.println("Sorry you are allowed to withdraw the money");



    }
}
