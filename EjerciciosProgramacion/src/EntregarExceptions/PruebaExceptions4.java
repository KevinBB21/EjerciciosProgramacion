/*
 * Proyecto EjerciciosProgramacion - Archivo PruebaExceptions4.java - Compañia DAW
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
 * @date 14 feb. 2022 21:17:38
 */
public class PruebaExceptions4 {

    public static void main(String[] args) {

        int n = (int) (Math.random() * (100 - 1 + 1) + 1);
        double[] v = new double[n];
        boolean cond = false;
        int pos = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {

            v[i] = (int) (Math.random() * (10 - 1 + 1) + 1);
        }
        do {
            try {
                pos = in.nextInt();
                cond = true;
                System.out.println(v[pos]);
            } catch (InputMismatchException e) {
                
                System.out.println("No es un valor que se pueda añadir al vector");
                in.nextLine();
                
            } catch (ArrayStoreException a) {
                System.out.println("No es un objeto que se pueda añadir");
                in.nextLine();
            } catch (ArrayIndexOutOfBoundsException u) {
                System.out.println("No esta en el tamaño");
                in.nextLine();
            }

        } while (cond);

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

    }
}
