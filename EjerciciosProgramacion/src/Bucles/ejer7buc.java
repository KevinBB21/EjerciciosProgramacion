package Bucles;

import java.util.Scanner;

public class ejer7buc {
    public static void main(String[] args) {
        int A,B;
        int tot = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero");               
                A = in.nextInt();
        System.out.println("DIme otro numero");
                B = in.nextInt();
        
        for (int i = A; i <= B; i+=1) {
            tot = tot + i;
        }
        
        System.out.println(tot);
    }
   
    
}