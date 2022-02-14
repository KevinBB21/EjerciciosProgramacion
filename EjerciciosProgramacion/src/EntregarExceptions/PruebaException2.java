/*
 * Proyecto EjerciciosProgramacion - Archivo PruebaException2.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package EntregarExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 14 feb. 2022 20:43:47
 */
public class PruebaException2 {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
        int valor = 0;
        int valor2 = 0;
        
        boolean leido = false;
        do {
            try {
                System.out.println("Dime un numero");
                valor = in.nextInt();
                System.out.println("Dime otro numero");
                valor2 = in.nextInt();
                int div = valor/valor2;
                leido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error no es un numero");
                in.nextLine();
            }
              catch(ArithmeticException u){
                  System.out.println("Error no es una division valida");
                in.nextLine();
              }
        } while (!leido);
        
        
        System.out.println("Valor introducido " + valor);

        
        
    }
}
