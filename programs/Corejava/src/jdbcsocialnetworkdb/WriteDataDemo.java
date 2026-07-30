package jdbcsocialnetworkdb;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class WriteDataDemo {

    public static void main(String[] args) {

        Connection con  = JavaDatabaseConnectivityReadDataDemo.getDbConnection();

        try {
            Statement stmt = JavaDatabaseConnectivityReadDataDemo.getStatement(con);

            String insertQuery = "insert into users values (9,\"JJS\",\"jkjk789\")";

            stmt.execute(insertQuery);
            System.out.println("Record is inserted");


        } catch (SQLException ex){

            System.out.println("Record is not inserted");
            System.out.println(ex);
        }catch(Exception ex){
            System.out.println(ex);
        }






    }
}
