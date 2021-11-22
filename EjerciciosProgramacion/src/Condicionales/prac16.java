import java.util.Scanner;

public class prac16
{
    public static void main(String[] args) {
       
       int numero;
    Scanner in = new Scanner(System.in);
       
        System.out.println("Dime un numero del 1 al 6");
        
            numero = in.nextInt();
    
        int a = (int) (1 + (Math.random()* 6));  
            System.out.println("El numero es " + a); 
            
        if (a == numero)
            System.out.println("Has acertado es el mismo!");
        else 
            System.out.println("Has fallado sigue intentandolo");
        
        
       


            
    }
    
}