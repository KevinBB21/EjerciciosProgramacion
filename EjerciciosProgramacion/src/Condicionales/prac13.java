import java.util.Scanner;

public class prac13
{
    public static void main(String[] args) {
        
        int grados; 
        
        Scanner in = new Scanner(System.in);
        System.out.println("Dime los grados que hace hoy");
        
        grados = in.nextInt();
        
        if (grados < 10)
            System.out.println("Frio");
        else if (grados < 20)
            System.out.println("Templado");
        else if (grados < 30)
            System.out.println("Caluroso");
        else 
            System.out.println("Tropical");

            
    }
    
}