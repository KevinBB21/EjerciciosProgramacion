/*
 * Proyecto EjerciciosProgramacion - Archivo Derechaizquierda.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Aceptareto;

import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 15 dic. 2021 16:33:15
 */
public class Derechaizquierda {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        
        do {
            n = in.nextInt();
            if (n % 2 == 1 && n != 0) {
                System.out.println("IZQUIERDA");
            } else if (n % 2 == 0 && n != 0) {
                System.out.println("DERECHA");

            }

        } while (n != 0);

    }

}
