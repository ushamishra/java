import bank.BankAccount;

public class BankAccountMainClass {

    public static void main(String[] args) {

        //create the connection to the db
        //con.fetch = 10 records

        String str = "pawd";

        for(int i = 1; i<=10; i++) {  //javac java.lang package byte,short,int long float double

            BankAccount bankAccont = new BankAccount((int)(Math.random()*1000000),str+i,Math.random(),"saving");

            System.out.println("Bankaccount ="+i +" Account number = "+bankAccont.getBankAccoountNumber() + " Balance = "+ (bankAccont.getBalance()*10000));


        }


    }
}
