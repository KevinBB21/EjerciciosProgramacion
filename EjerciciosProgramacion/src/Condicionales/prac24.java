import java.util.Scanner;

public class prac24
{
    public static void main(String[] args) {
            
            int compra;
            double contado = 0.95;
            double tarjeta = 1.03;
            boolean contados;
        
            Scanner in = new Scanner(System.in);
            
            System.out.println("Dime el precio de lo que has comprado");
            compra = in.nextInt();
            
            System.out.println("Vas a pagar en mano?");
            contados = in.nextBoolean();
            
            if (contados == true)
                System.out.println("Vas a pagar " + (compra * contado) + "€ al pagar en mano");
            else 
                System.out.println("Vas a pagar " + (compra * tarjeta) + "€ al pagar por tarjeta");
            
            
    }
}