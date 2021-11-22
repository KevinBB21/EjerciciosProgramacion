import java.util.Scanner;

public class Prac12
{
    public static void main(String[] args) {
        boolean bisiesto;
        int dias; 
        int mes;
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero entre 1 y 12");
        
            mes = in.nextInt();
        System.out.println("Este año es bisiesto?");
        
            bisiesto = in.nextBoolean();
        
        switch (mes) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
            dias = 31;
                break;
            case 4: case 6: case 9: case 11:
            dias = 30;
                break;
            case 2:
            if (bisiesto == true)
                dias = 29;
            else
                dias = 28;
               break;
            default:
                dias = 0;
                

        }
             System.out.println( dias );  
            
    }
    
}