import java.util.Scanner;

public class prac22
{
    public static void main(String[] args) {
            
            double objeto1;
            double objeto2;
            double objeto3;
            double iva;
            
            Scanner in = new Scanner(System.in);
            
            System.out.println("Primero objeto");
            objeto1 = in.nextDouble();
     
            System.out.println("Segundo objeto");
            objeto2 = in.nextDouble();
            
            System.out.println("Tercer objeto");
            objeto3 = in.nextDouble();
            
            System.out.println("Dime el iva");
            iva = in.nextDouble();
                
            double suma = (objeto1 + objeto2 + objeto3);
            double suma_iva = suma * iva / 100;
            double suma_descuento = ((suma) - (suma * 0.05) + (suma_iva));
            
            System.out.println("Suma de los objetos es " + suma);
            System.out.println("El valor del iva es " + suma_iva);
            System.out.println("La suma total de los productos tras el iva " + ((suma * iva / 100) + suma));            
        
            if (suma > 50)
                System.out.println("Precio con descuento y iva " + suma_descuento);
                
            
        
        
        
        
    }
}