/*
 * Proyecto Strings - Archivo arrays3.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 10 nov. 2021 20:21:15
 */
public class arrays3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int media = 0;
        int fin = 0;
        System.out.println("Dime 20 numeros");

        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = in.nextInt();
            media += numeros[i];
            fin = media / 20;
        }
        System.out.println(fin);
    }
}
