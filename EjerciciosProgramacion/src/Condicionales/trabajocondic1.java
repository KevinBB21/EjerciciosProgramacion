import java.util.Scanner;

public class prac19
{
    public static void main(String[] args) {
           
        int x;
        char letra;
        int factor = 0;
        int riesgo = 5;
        
            Scanner in = new Scanner(System.in);
            
            System.out.println("Porfavor responda estas preguntas con s/n");
            
                letra = in.next().charAt(0);
            
            System.out.println("Tienes la presión arterial alta?");
            
            letra = in.next().charAt(0);
            
            if (letra == 's'){
                riesgo +=15;
                factor +=1;
            }
            
            System.out.println("Tienes el colestero elevado?");
            
            letra = in.next().charAt(0);
            
            if (letra == 's'){
                riesgo +=15;
                factor +=1;
            }
            
            System.out.println("Tienes diabetes?");
            
            letra = in.next().charAt(0);
            
            if (letra == 's'){
                riesgo +=10;
                factor +=1;
            }
            
            System.out.println("Estas obeso?");
            
            letra = in.next().charAt(0);
            
            if (letra == 's'){
                riesgo +=10;
                factor +=1;
            }
            
            System.out.println("Haces tabaquismo?");
            
            letra = in.next().charAt(0);
            
            if (letra == 's'){
                riesgo +=10;
                factor +=1;
            }
            
            System.out.println("Eres inactivo fisicamente?");
            
            letra = in.next().charAt(0);
            
            if (letra == 's'){
                riesgo +=10;
                factor +=1;
            }
            
            System.out.println("Eres hombre?");
            
            letra = in.next().charAt(0);
            
            if (letra == 's'){
                riesgo +=5;
                factor +=1;
            }
                
            System.out.println("Familiares con enfermedades del corazón?");
            
            letra = in.next().charAt(0);
            
            if (letra == 's'){
                riesgo +=5;
                factor +=1;
            }   
            
            System.out.println("Edad superior a 55 años");
            
            letra = in.next().charAt(0);
            
            if (letra == 's'){
                riesgo +=5;
                factor +=1;
            }
        
            double total = riesgo * factor;
            
            if (factor == 2)
                System.out.println(total * 1.25);
            else if (factor <= 4)
                System.out.println(total * 1.5);
            else if (factor <= 6)
                System.out.println(total * 1.75);
            else if (factor <= 8)
                System.out.println(total * 2);
            else 
                System.out.println(+total * 2.5);
                
        
    }
}