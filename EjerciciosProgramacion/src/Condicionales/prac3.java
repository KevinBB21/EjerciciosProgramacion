import java.util.Scanner;

public class Prac3
{
    public static void main(String[] args) {
         
        int a;
        int b;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime un numero");
            
            a = in.nextInt();
            
        System.out.println("Dime otro numero");
        
            b = in.nextInt();
            
            
            
            
            if (a > b){
                System.out.println("A es mayor que B");
            }
            else{
                System.out.println("B es mayor que A");
            }
                
        
    }
}
