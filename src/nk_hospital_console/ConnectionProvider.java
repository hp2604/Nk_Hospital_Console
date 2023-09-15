
package nk_hospital_console;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionProvider {
      private static Connection con;
    public static Connection getConnection()
    {
        String url="jdbc:mysql://localhost:3306/record";
        String username="root";
        String password="Harsh2604";
                
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
         con=DriverManager.getConnection(url,username,password);
             
        }
        catch (Exception e)
        {
           e.printStackTrace();
        }
               
        return con;
    }

    
    
}
