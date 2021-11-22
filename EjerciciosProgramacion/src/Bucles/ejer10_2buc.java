/*
 * Proyecto UD3_ejercicios - Archivo ejer10_2buc.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 20:46:53
 */
package Bucles;

import java.util.Scanner;

public class ejer10_2buc {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;
        boolean multi = true;
        System.out.println("Dime un numero para saber si es primo");
        n = in.nextInt();
        for (int i = 2; i < n; i++) {
            // si el resto es 0
            if ((n % i) == 0) {
              multi = false;  
            }
        }
        System.out.println(multi + " (true = primo , false = no primo)");
    }

}
