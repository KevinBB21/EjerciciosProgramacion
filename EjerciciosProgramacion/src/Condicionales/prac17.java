import java.util.Scanner;

public class prac17
{
    public static void main(String[] args) {
            
            double objeto1;
            double iva;
            
            Scanner in = new Scanner(System.in);
            
            System.out.println("Primero objeto");
     
                objeto1 = in.nextDouble();
     
            System.out.println("Porcentaje de IVA");
            
                iva = in.nextDouble();
            
            System.out.println("El objeto sin iva es " + (objeto1));
            
            System.out.println("El porcentaje de iva es " + iva +("%"));
            
            System.out.println("La suma total del producto tras el iva " + (objeto1 * (1 + (iva / 100))));            
        
            if (objeto1 <= 0 || iva <= 0)
                System.out.println("ERROR algun valor es 0 o menor");
        
        
        
        
    }
}