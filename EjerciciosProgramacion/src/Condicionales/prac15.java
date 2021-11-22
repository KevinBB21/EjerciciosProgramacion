import java.util.Scanner;

public class prac15

{
    public static void main(String[] args) {
        int eva1;
        int eva2; 
        int eva3;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Primera eva");
        
        eva1 = in.nextInt();
        
        System.out.println("Segunda eva");
        
        eva2 = in.nextInt();
        
        System.out.println("Tercera eva");
          
        eva3 = in.nextInt();  
        
        System.out.println("nota media");
            
        System.out.println(Math.round((double)(eva1 + eva2 + eva3) / 3));
        
        if (eva1 < 5 || eva2 < 5 || eva3 < 5)
            System.out.println("has sacado un " + 4 + " lo siento");
        
    }
    
    
}