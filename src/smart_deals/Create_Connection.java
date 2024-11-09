package smart_deals;

import java.sql.Connection;
import java.sql.DriverManager;

public class Create_Connection {
    
    static Connection con;
    
    
    public static Connection Cret_conn() {
        
       
       try {
//           Load drivers
           Class.forName("com.mysql.jdbc.Driver");
           
           //create the connection...
           String User = "root";
           String Password = "mysql@Login2002";
           String url = "jdbc:mysql://localhost:3306/smartdeals";
           
           
           con = DriverManager.getConnection(url, User, Password);
           
       }catch(Exception e) {
           e.printStackTrace();
       }
       
        return con;
    }

}
