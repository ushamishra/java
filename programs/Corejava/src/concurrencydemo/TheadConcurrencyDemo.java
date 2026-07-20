package concurrencydemo;

import exceptiondemo.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.*;

// 20 no .of task - in parallel

class BankUser {
     int accountid;
     String pwd;

    public BankUser(int accountid, String pwd) {
        this.accountid = accountid;
        this.pwd = pwd;
    }
}

class DatabaseTask implements Callable<Integer> {

    BankUser user ;
    DatabaseTask(BankUser user){
        this.user = user;
    }
    @Override
    public Integer call() throws Exception {

        //Calling the database and fetching the user details user.accountid
      Integer balance = 40000;

      return balance;

    }
}

public class TheadConcurrencyDemo {


    public static void main(String[] args) {



        //case 1 : 30 threads reached to the server

        Stack<BankUser> userList = new Stack<>();
         for(int i = 1; i<= 30; i++){

             Integer accountId = (int)Math.random()*100000;
             String pwd = "abc"+i;
             BankUser user = new BankUser(accountId,pwd);
             userList.add(user);

         }
        //step 1: Create a threadpoll

        ExecutorService threadPool = Executors.newFixedThreadPool(20);

        //submit the request to callable task
        Future<Integer> future = threadPool.submit(new DatabaseTask(userList.pop()));

        try {
            System.out.println(future.get());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }



}
