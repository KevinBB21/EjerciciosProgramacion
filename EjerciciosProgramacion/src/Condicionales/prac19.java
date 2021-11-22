import java.util.Scanner;

public class prac19
{
    public static void main(String[] args) {
           
        int x;
        char letra;
        
            Scanner in = new Scanner(System.in);
            
            System.out.println("Dime un numero");
     
                x = in.nextInt();
                
            System.out.println("Dime una letra entre c, s ,t");
            
                letra = in.next().charAt(0);
            
            int asciiValue = letra;
                
            if (asciiValue == 115 )
            
                System.out.println(Math.sin(x));
            
            else if (asciiValue == 99)
            
                System.out.println(Math.cos(x));
                
            else if (asciiValue == 116)
            
                System.out.println(Math.tan(x));
                
            else 
                System.out.println("Error caracter incorrecto");
     

        
        
        
        
    }
}