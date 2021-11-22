import java.util.Scanner;

public class prac18
{
    public static void main(String[] args) {
           
        char letra;
        
            Scanner in = new Scanner(System.in);
                
            System.out.println("Dime una letra");
            
                letra = in.next().charAt(0);
            
            int asciiValue = letra;
                
            if (asciiValue <= 90 )
            
                System.out.println("Es mayuscula!");
            else 
                System.out.println("Es minuscula!");

     

        
        
        
        
    }
}