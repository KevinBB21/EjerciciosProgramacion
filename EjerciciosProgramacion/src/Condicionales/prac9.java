import java.util.Scanner;

public class Prac9
{
    public static void main(String[] args) {
         
        int a;
        int b;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime un numero");
            
            a = in.nextInt();
            
        System.out.println("Dime otro numero");
        
            b = in.nextInt();
            
            
            
            
            if (a % b == 0 || b % a == 0){
                System.out.println("A es multiplo de B o B es multiplo de A");
            }
            else{
                System.out.println("A no es multiplo de B o B no es multiplo de A");
            }
                
        
    }
}