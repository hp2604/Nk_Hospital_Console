
package nk_hospital_console;
import java.sql.SQLException;
import java.util.Scanner;

public class Nk_Hospital_console {

    
    public static void main(String[] args) throws SQLException {
      System.out.println("\t \t     N.K Hospital");
        System.out.println("\t \t ------------------------");
        int ch;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("1.Appointment\n2.Schedule\n3.Search \n4.Exist");
            System.out.print("Enter the choice : ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1 :
                        appointment ap=new appointment();
                        ap.Insert();
                        
                break;
                case 2: doctors.Search();
                 break;
                 case 3: search.recordDetail();
                 break;
                 
                 
            }
        }while(ch!=4);
                
                
                
                
        
    }
    
}
