import java.util.Scanner;

public class Prac4
{
    public static void main(String[] args) {
         
        double numero;    
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime un numero");
            
            numero = in.nextDouble();
            
            if (numero >= 0 ){
                System.out.println("Es positivo");
            }
            else{
                System.out.println("Es negativo");
            }
                
        
    }
}
