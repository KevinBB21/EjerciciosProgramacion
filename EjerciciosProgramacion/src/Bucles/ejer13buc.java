package Bucles;

import java.util.Scanner;

public class ejer13buc {
    public static void main(String[] args) {
        int A,B;
        int par;
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero");
            A = in.nextInt();
        System.out.println("Dime otro numero");
            B = in.nextInt();

        for (int i = A; i <= B; i++) {
            if (i % 2 == 0)
                System.out.println(i);
             
          
           
        }
            
        

      }
        
    }
   
    
