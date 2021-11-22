package Bucles;

import java.util.Scanner;

public class ejer12buc {
    public static void main(String[] args) {
        int A,B;
        

        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero");
            A = in.nextInt();
        System.out.println("Dime otro numero");
            B = in.nextInt();
        while(A < 0 ){
            A++;
        }
        
        while(A >= 0 && A <= B){
            System.out.println(A);
            A++;
        }
            
             
        
       System.out.println();
      }
        
    }
   
    
