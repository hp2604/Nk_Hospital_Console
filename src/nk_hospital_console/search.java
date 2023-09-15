package nk_hospital_console;

import java.sql.*;
import java.util.Scanner;


public class search {
    public static void recordDetail() throws SQLException
    {
       
        Connection con=ConnectionProvider.getConnection();
        int recordNo ;
        String query="select * from patients where recordNo=?";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the record Number");
        recordNo=sc.nextInt();
         for(int i=0;i<20;i++);
                {
                    System.out.print("---");
                }
                System.out.println();
        PreparedStatement prm= con.prepareStatement(query);
        prm.setInt(1, recordNo);
        ResultSet rs=prm.executeQuery();
               
               
        while(rs.next())
        {
           System.out.println("Record No : " + rs.getInt(1)) ;
           System.out.println("Name : " + rs.getString(2));
           System.out.println("Family Member :" + rs.getString(3));
           System.out.println("Age :" + rs.getInt(4));
           System.out.println("Gender : " +  rs.getString(5));
           System.out.println("Contact : " + rs.getLong(6));
           System.out.println("Address : " + rs.getString(7));
           System.out.println("Disease : " + rs.getString(8));
           System.out.println("Doctor : " + rs.getString(9));
           System.out.println("Previous Record Number : " + rs.getInt(10));
           System.out.println("Dated : " + rs.getDate(11));
           System.out.println();
             
        }
         for(int i=0;i<20;i++);
                {
                    System.out.print("---");
                }
        
    }
    
}
