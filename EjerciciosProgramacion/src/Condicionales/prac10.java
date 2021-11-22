import java.util.Scanner;

public class Prac10
{
    public static void main(String[] args) {
         
        double a;
        double b;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime un numero");
            
            a = in.nextInt();
            
        System.out.println("Dime otro numero");
        
            b = in.nextInt();
            
            System.out.println( a + b );
            System.out.println( a - b );
            System.out.println( a * b );
            if (a == 0 || b == 0) {
                System.out.println("No se puede dividir con un 0");
            }
            else{
                System.out.println( a / b );
            }
        
            
            
            
                
        
    }
}