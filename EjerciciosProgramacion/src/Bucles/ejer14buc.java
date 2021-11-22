package Bucles;

import java.util.Scanner;

public class ejer14buc {
    public static void main(String[] args) {
        int numero;
        int i = 1;
        
        Scanner in = new Scanner(System.in);
        
        do { 
            System.out.println("Dime un numero");
                numero = in.nextInt();
                if (numero % 10 == 0)
                    System.out.println(numero + " Es divisible entre 10");   
                    i++;
            
        } while (i <= 5);
             
             
        
      }
        
    }
   
    
