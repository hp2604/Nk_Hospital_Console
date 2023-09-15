
package nk_hospital_console;
import java.util.Scanner;

public class Nk_Hospital_console {

    
    public static void main(String[] args) {
      System.out.println("\t \t     H.N Hospital");
        System.out.println("\t \t ------------------------");
        int ch;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("1.Appointment\n2.Schedule\n3.Exist");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:appointment.Insert();
                break;
                case 2: doctors.Search();
                 break;
                 
            }
        }while(ch!=3);
                
                
                
                
        
    }
    
}
