/*
 * Proyecto EjerciciosProgramacion - Archivo PruebaException.java - Compañia DAW
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
 * @date 14 feb. 2022 20:17:09
 */
public class PruebaException {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor = 0;
        boolean leido = false;
        do {
            try {
                System.out.println("Dime un numero");
                valor = in.nextInt();
                leido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error no es un numero");
                in.nextLine();
            }
        } while (!leido);
        
        
        System.out.println("Valor introducido " + valor);

    }
}
