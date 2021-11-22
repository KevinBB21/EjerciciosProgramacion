import java.util.Scanner;

public class Prac11
{
    public static void main(String[] args) {
         
        int dia;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime un dia ");
            
            dia = in.nextInt();
            
        switch(dia){
            case 1:
                System.out.println("Es lunes");
        break;
          case 2:
                System.out.println("Es martes");
            break;
          case 3:
                System.out.println("Es miercoles");
            break;
          case 4:
                System.out.println("Es jueves");
           break;
          case 5:
                System.out.println("Es viernes");
           break;
          case 6:
                System.out.println("Es sabado");
        break;
          case 7:
                System.out.println("Es domingo");
         break;
          default:
                System.out.println("Dime un numero de dia");
        
         
        
        }
        
        }        
        
    }
