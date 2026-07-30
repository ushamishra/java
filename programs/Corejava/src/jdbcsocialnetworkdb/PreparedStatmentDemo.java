package jdbcsocialnetworkdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatmentDemo {
    public static void main(String[] args) throws SQLException {

        Connection con = JavaDatabaseConnectivityReadDataDemo.getDbConnection();

        PreparedStatement psmt = con.prepareStatement("insert into users values(?,?,?)");

        int count = 1;

        int maxCount = 3;
        Scanner sc = new Scanner(System.in);

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


                psmt.setInt(1,userid);
                psmt.setString(2,userName);
                psmt.setString(3,pwd);

                psmt.execute();
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
