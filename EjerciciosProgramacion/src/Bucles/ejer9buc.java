package Bucles;

import java.util.Scanner;

public class ejer9buc {
    public static void main(String[] args) {
        long A,B;
        long tot = 1;
       
        
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero");               
        A = in.nextInt();
        System.out.println("DIme otro numero");
        B = in.nextInt();
        
        while(A <= B){
            tot *= A;
            A++;
            
        }
        
        System.out.println(tot);
    }
   
    
}