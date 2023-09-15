
package nk_hospital_console;
import java.sql.*;
import java.util.Scanner;


public class appointment {
     String pname,fname,doctor,address,gender,disease;
       long number;int age,recordNo;int id;
       Date d;
       PreparedStatement prm;

        
     public  void Insert()
    {
       Connection c=ConnectionProvider.getConnection();
       Scanner sc=new Scanner(System.in);
      
       System.out.println("\t \t     N.K Hospital");
        System.out.println("\t \t ------------------------");
       
       //Patient name . pname=patient name;
       System.out.print("Enter the name of patient : ");
       pname=sc.nextLine();
       
       //Family member . fname=family Name.
       System.out.print("Enter the name of family Member : ");
       fname=sc.nextLine();
       
       //Age .
       System.out.print("Enter the age of patient : ");
       age=sc.nextInt();
       
       //gender
       System.out.print("Enter the gender : ");
       gender=sc.next();
       
       //contact
       System.out.print("Enter the contact number : ");
       number=sc.nextLong();
       
       //address
       System.out.print("Enter the address : ");
       address=sc.nextLine();
       address=sc.nextLine();
       
       
       //disease 
       System.out.print("Enter the disease : ");
       disease=sc.nextLine();
       
       //doctor 
       System.out.print("Enter the doctor name : ");
       doctor=sc.nextLine();
       
       //Reord Number Previous
       System.out.print("Enter the Previous Record Number");
       recordNo=sc.nextInt();
        d=new Date(System.currentTimeMillis());
       
       //Query
        String query="insert into patients (pname,fname,age,gender,contact,address,disease,doctor,previousRecordNo,dateofVisit) Values(?,?,?,?,?,?,?,?,?,?)";
        String query2="select max(recordno) from patients"; 
        try
       { 
        prm= c.prepareStatement(query);
        prm.setString(1,pname);
        prm.setString(2,fname );
        prm.setInt(3, age);
        prm.setString(4, gender);
        prm.setLong(5, number);
        prm.setString(6, address);
        prm.setString(7,disease );
        prm.setString(8,doctor );
        prm.setInt(9, recordNo);
        prm.setDate(10,d );
        prm.executeUpdate();
        prm=c.prepareStatement(query2);
        ResultSet st=prm.executeQuery();
        while(st.next())
        {
            id=st.getInt(1);
        }
        print();
        
        
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
     public void print()
     {
         System.out.println("\t Nk Hospital");
         for(int i=0;i<20;i++)
         {
             System.out.print("---");
         }
         System.out.println();
         System.out.println("|\t RecordNo.: " + id + "\t\t Date : " + d);
         System.out.println("|\t Name : " + pname );
         System.out.println("|\t Age : " + age );
         System.out.println("|\t Gender : " + gender );
         System.out.println("|\t Disease : " + disease +"\n|\t Doctor : " + doctor);
          for(int i=0;i<20;i++)
         {
             System.out.print("---");
         }
        for(int i=0;i<10;i++)
        {   System.out.print("|");
            System.out.println();
        }
         for(int i=0;i<20;i++)
         {
             System.out.print("---");
         }
         System.out.println();
         
     }
    
}
