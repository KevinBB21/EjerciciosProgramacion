import java.util.Scanner;

public class Prac2
{
    public static void main(String[] args) {
         
        int edad;    
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime tu edad");
            
            edad = in.nextInt();
            
            if (edad >= 18 ){
                System.out.println("Eres mayor de edad");
            }
            else{ 
                System.out.println("Eres menor de edad");
            }
        
            
                
        
    }
}
