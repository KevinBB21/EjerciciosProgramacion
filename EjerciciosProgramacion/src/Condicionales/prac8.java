import java.util.Scanner;

public class Prac8
{
    public static void main(String[] args) {
         
        int a;
        int b;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime un numero");
            
            a = in.nextInt();
            
        System.out.println("Dime otro numero");
        
            b = in.nextInt();
            
            
            
            
            if (a % b == 0){
                System.out.println("A es multiplo de B");
            }
            else{
                System.out.println("A no es multiplo de B");
            }
                
        
    }
}
