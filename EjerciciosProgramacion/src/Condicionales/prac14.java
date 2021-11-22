import java.util.Scanner;

public class prac14
{
    public static void main(String[] args) {
    
    int hombres;
    int mujeres;
    
        Scanner in = new Scanner(System.in);
    
    System.out.println("Cuantos hombres hay en el aula?");
        
            hombres = in.nextInt();
            
    System.out.println("Y cuantas mujeres?");
        
            mujeres = in.nextInt();

        int total = hombres + mujeres;
        
    System.out.println(100 * (double)hombres / (double)total + " ese es el porcentaje de hombres" );
    System.out.println(100 * (double)mujeres / (double)total + " ese es el porcentaje de mujeres"  );
    
        if (hombres > mujeres)
            System.out.println("hay mas hombres que mujeres");
        else
            System.out.println("hay mas mujeres que hombres");
        

















            
    }
    
}