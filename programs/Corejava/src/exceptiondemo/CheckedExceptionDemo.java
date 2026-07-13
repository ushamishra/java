package exceptiondemo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//package is collection of classes
// jar is collection of packages and classes

public class CheckedExceptionDemo {


    public static List<User> getDBUsers(){

        String url = "jdbc:mysql://localhost:3306/testdb"; // database name = testdb
        String dbUser = "root";
        String password = "root";
        List<User> userList = new ArrayList<User>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, dbUser, password);
            System.out.println("Connectin "+con);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from user_details");
            while(rs.next()){

//                System.out.println("id: "+ rs.getInt(1) + "  birth_day: "+rs.getString(2)+"  name: "+rs.getString(3));

                User user = new User(rs.getInt(1),rs.getString(2),rs.getString(3));
                userList.add(user);

            }
        }catch(SQLException e){

            System.out.println(e.getMessage());

        } catch (ClassNotFoundException e) {

            System.out.println();

        }catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return userList;
    }

    public static void main(String[] args){

        getDBUsers();
    }

}



