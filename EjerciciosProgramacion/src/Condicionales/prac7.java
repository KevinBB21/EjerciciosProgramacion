import java.util.Scanner;

public class Prac7
{
    public static void main(String[] args) {
         
        int a;
        int b;
        int c;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime un numero");
            
            a = in.nextInt();
            
        System.out.println("Dime otro numero");
        
            b = in.nextInt();
        
        System.out.println("Ultimo numero");
            
            c = in.nextInt();
            
            if (a > b && a > c){
                System.out.println("A es el mayor");
            }
            else if (b > a && b > c){
                System.out.println("B es el mayor");
            }
            else if (c > a && c > b){
                System.out.println("C es el mayor");
            }
    }
}
