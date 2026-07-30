package jdbcsocialnetworkdb;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatemetDemo {

    public static void main(String[] args) {
        Connection con = JavaDatabaseConnectivityReadDataDemo.getDbConnection();
        String sql = "{? = call getTotalPostByUser(?)}";
        try {
            CallableStatement cstmt = con.prepareCall(sql);
            int user_id = 1;
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setInt(2,user_id);
            cstmt.execute();
            int totalpost = cstmt.getInt(1);


            System.out.println("Total post : "+totalpost);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
