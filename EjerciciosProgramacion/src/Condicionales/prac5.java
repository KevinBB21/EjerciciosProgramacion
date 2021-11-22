import java.util.Scanner;

public class Prac5
{
    public static void main(String[] args) {
         
        Double A;
        Double B;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime un numero");
            
            A = in.nextDouble();
            
        System.out.println("Dime otro numero");    
            
            B = in.nextDouble();
            
            if (A > B ){
                System.out.println(A +" " + B);
            }
            else {
                System.out.println(B +" " + A);
            }
                
        
    }
}
