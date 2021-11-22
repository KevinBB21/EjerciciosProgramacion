import java.util.Scanner;

public class prac23
{
    public static void main(String[] args) {
            
            int edad;
            int cuota = 200;
            double descuento_mayores = 0.5;
            double descuento_menores = 0.75;
            double descuento_menorsocio = 0.65;
            boolean socio;    
        
            Scanner in = new Scanner(System.in);
            
            System.out.println("Dime tu edad");
            edad = in.nextInt();
            
            System.out.println("Eres socio?");
            socio = in.nextBoolean();
            
            
            
            if (edad <= 18 && socio == true)
                System.out.println("Tu pagas " + (cuota * descuento_menorsocio) + "€");
            
            else if (edad <=18 )
                System.out.println("Tu pagas " + (cuota * descuento_menores) + "€");
        
            else if (edad >= 65)
                System.out.println("Tu pagas " + (cuota * descuento_mayores) + "€");
        
    }
}