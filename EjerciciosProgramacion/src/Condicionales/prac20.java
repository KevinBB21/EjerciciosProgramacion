import java.util.Scanner;

public class prac20
{
    public static void main(String[] args) {
           
        double nota;
        
            Scanner in = new Scanner(System.in);
                
            System.out.println("Dime tu nota");
            
                nota = in.nextDouble();
            
            if (nota <= 3)
                 
                 System.out.println("Has sacado un una D muy deficiente");
            
            else if (nota < 6)
            
                System.out.println("Has sacado una D+ insuficiente");
                
            else if (nota < 7)
            
                System.out.println("Has sacado una C bien");
                
            else if (nota < 10)
            
                System.out.println("Has sacado una B notable");
                
            else 
            
                System.out.println("Has sacado una A sobresaliente");
            

        
    }
}