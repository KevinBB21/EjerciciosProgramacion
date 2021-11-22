package Bucles;

import java.util.Scanner;

public class ejer10buc {
    public static void main(String[] args) {
        long precio;
        long tot = 0;
        int i = 1;
        
        Scanner in = new Scanner(System.in);
        
        while(i <= 5){
            System.out.println("Dime un precio");               
            precio = in.nextInt();
            i++;
            tot += precio;
        
            }  
       System.out.println(tot);
      }

    }
   
    
