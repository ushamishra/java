package jdbcsocialnetworkdb;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class WriteDynamicData {

    public static void main(String[] args) {

        int count = 1;

        int maxCount = 3;
        Scanner sc = new Scanner(System.in);

        Connection con = JavaDatabaseConnectivityReadDataDemo.getDbConnection();
        Statement stmt = null;
        try {
            stmt = JavaDatabaseConnectivityReadDataDemo.getStatement(con);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        while (count <= maxCount) {

            System.out.println("Enter the user id");

            int userid = sc.nextInt();

            // Write your code here.
            sc.nextLine();

            System.out.println("Enter the user name");

            String userName = sc.nextLine();


            System.out.println("Enter the user password");

            String pwd = sc.nextLine();



            try {


                String insertQuery = "insert into users values (" + userid + ",'" + userName + "','" + pwd + "')";


                stmt.execute(insertQuery);
                System.out.println("Record is inserted");


            } catch (SQLException ex) {

                System.out.println("Record is not inserted");
                System.out.println(ex);
            } catch (Exception ex) {
                System.out.println(ex);
            }

            count++;
        }

    }

}
