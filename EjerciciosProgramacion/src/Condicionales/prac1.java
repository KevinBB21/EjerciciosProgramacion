
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;

public class Prac1
{
    public static void main(String[] args) {
         
        int edad;    
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime tu edad");
            
            edad = in.nextInt();
            
            if (edad >= 18 ){
                System.out.println("Eres mayor de edad");
            }
            
                
        
    }
}
