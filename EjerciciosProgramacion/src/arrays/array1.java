/*
 * Proyecto Strings - Archivo array1.java - Compañia DAW
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
public class array1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime 10 numeros");

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = in.nextInt();
            System.out.println(i);
            
        }

    }
}
