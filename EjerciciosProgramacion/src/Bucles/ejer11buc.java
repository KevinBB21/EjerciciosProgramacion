package Bucles;

import java.util.Scanner;

public class ejer11buc {
    public static void main(String[] args) {
        int precio;
        int tot = 0;
        int i = 1;
        
        Scanner in = new Scanner(System.in);
        
        do { 
            System.out.println("Dime un precio");
            precio = in.nextInt();
            tot += precio;
        } while (precio >= 0);
             
             
        
       System.out.println(tot);
      }
        
    }
   
    
