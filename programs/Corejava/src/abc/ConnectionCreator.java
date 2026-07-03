package abc;

import java.sql.Connection;

public interface ConnectionCreator {
    public Connection con = null;

    public Connection createConnection(String host, String username, String pwd, String dbName) ;

}

class UnderlineConnection {


    static  ConnectionCreator myDBCon = new MySqlConnectionDb();



}

class MySqlConnectionDb implements ConnectionCreator {

    public Connection createConnection(String host, String username, String pwd, String dbName) {
      //mysql approach of connection
        return con;
    }
}

class PostgeConnectionDb implements ConnectionCreator {
    @Override
    public Connection createConnection(String host, String username, String pwd, String dbName) {
     //postgre approach
        return con;
    }
}

class OracleConnectionDb implements ConnectionCreator {
    @Override
    public Connection createConnection(String host, String username, String pwd, String dbName) {
    //oracle approach
        return con;
    }
}

class SQLServer implements ConnectionCreator{

    @Override
    public Connection createConnection(String host, String username, String pwd, String dbName) {
       //sql server approch
        return con;
    }
}