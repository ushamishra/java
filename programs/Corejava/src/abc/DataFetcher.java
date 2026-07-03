package abc;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataFetcher {


    public void fetchData() throws SQLException {

        Connection con = UnderlineConnection.myDBCon.
                createConnection("18.90.230.12","root","root","test");
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("Select * from employee");

        while (rs.next()){
            String empId = rs.getString(1);
            String empName = rs.getString(2);
            String empDept = rs.getString(3);
        }
        }

    }

