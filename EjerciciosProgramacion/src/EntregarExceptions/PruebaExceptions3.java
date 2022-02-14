/*
 * Proyecto EjerciciosProgramacion - Archivo PruebaExceptions3.java - Compañia DAW
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
 * @date 14 feb. 2022 20:59:18
 */
public class PruebaExceptions3 {

    public static void main(String[] args) {

        double[] v = new double[5];
        boolean cond;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            cond = false;
            do{
                
            try {
                v[i] = in.nextInt();
                cond = true;
            } catch (InputMismatchException e) {
                System.out.println("No es un valor que se pueda añadir al vector");
                in.nextLine();
            } catch (ArrayStoreException a) {
                System.out.println("No es un objeto que se pueda añadir");
                in.nextLine();
            }
            }while(!cond);
        }
    }
}
