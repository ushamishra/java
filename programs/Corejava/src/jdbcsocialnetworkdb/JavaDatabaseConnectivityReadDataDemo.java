package jdbcsocialnetworkdb;

import java.sql.*;

public class JavaDatabaseConnectivityReadDataDemo {


    public static Connection getDbConnection() {

        String dbServerUrl = "jdbc:mysql://localhost:3306/socialnetworksite";
        String userName = "root";
        String pwd = "root";

        //step 1: Install DB driver. In my case it is Mysql db
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //step 2 : connect to the DB
            Connection con = DriverManager.getConnection(dbServerUrl, userName, pwd);
            return con;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


   public static Statement getStatement(Connection con) throws SQLException {

        Statement stmt = con.createStatement();
        return stmt;
    }


    public static void main(String[] args) {

            Connection con  = getDbConnection();
            String selectQuery = "select * from users";

            try {

                Statement stmt = getStatement(con);
                ResultSet rs = stmt.executeQuery(selectQuery);

                //select Data
                while (rs.next()) {

                    System.out.println("UserId =  "
                            + rs.getInt(1) +
                            " User Name= "
                            + rs.getString(2)
                            + " Password = " + rs.getString(3));
                }
            }catch(SQLException sq){
                System.out.println(sq);
            }

    }
}
