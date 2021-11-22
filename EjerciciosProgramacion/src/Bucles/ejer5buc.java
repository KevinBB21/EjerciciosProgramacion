package Bucles;

import java.util.Scanner;

public class ejer5buc {
    public static void main(String[] args) {
        int A,B;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero");               
                B = in.nextInt();
        System.out.println("Dime otro numero");
                A = in.nextInt();
        
        for (int i = B; i >= A; i-=2) 
            System.out.println(i);
           
    }
    
    
}