
package nk_hospital_console;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class doctors {
    public static void Search()
    {
         Connection c=ConnectionProvider.getConnection();
         Scanner sc=new Scanner(System.in);
         String key;//Search for Doctor
         String dname,category,aday,atime;
         System.out.print("Enter the Field ");
         key=sc.nextLine();
         System.out.println();
         
         String query="select * from doctor where category= ?";
         
         try
         {
            PreparedStatement prm= c.prepareStatement(query);
            prm.setString(1,key);
           ResultSet rs=  prm.executeQuery();
            while(rs.next())
            {
                dname= rs.getString(2);
                category =rs.getString(3);
                aday=rs.getString(4);
                atime=rs.getString(5);
                System.out.println("\n_____________________");
                System.out.println(dname + "   " + category);
                System.out.println(aday + "\n" + atime);
                System.out.println("_____________________");
                
            }
         }
         catch (Exception e)
         {
             e.printStackTrace();
         }
         
        
         
         
         
        
        
    }
    
    
}
