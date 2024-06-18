package EmpApp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection con;
    public static Connection createDBConnection() throws Exception{
        //load the driver class
        //Class.forName("com.mysql.jdbc.Driver");
        //get connection
       // String url="jdbc:mysql://localhost:3306/employeeDB?useSSL=false";
        String url="jdbc:mysql://localhost:3306/employeeDB";
        String username="root";
        String password="17072003";
        con=DriverManager.getConnection(url,username,password);


        //get connection
        return con;
    }
}
