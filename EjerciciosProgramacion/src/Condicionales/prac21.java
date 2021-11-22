import java.util.Scanner;

public class prac21
{
    public static void main(String[] args) {
           
        double peso;
        double altura;
        
            Scanner in = new Scanner(System.in);
                
            System.out.println("Dime tu peso");
            
                peso = in.nextDouble();
            
            System.out.println("Dime tu altura");
            
                altura = in.nextDouble();
            
        double imc = peso / (altura * altura);
        
            if (imc < 16)
            
                System.out.println("Deberias ir al hospital");

            else if (imc < 17)
            
                System.out.println("Infrapeso");
                
            else if (imc < 18)
            
                System.out.println("Bajo peso");
                
            else if (imc < 25)
            
                System.out.println("Peso normal");
            
            else if (imc < 30)
            
                System.out.println("Sobrepeso");
                
            else if (imc < 35)
            
                System.out.println("Sobrepeso cronico");
                
            else if (imc < 40)

                System.out.println("Obesidad premórbida");
                
            else 
                
                System.out.println("Obesidad mórbida");
    }
}