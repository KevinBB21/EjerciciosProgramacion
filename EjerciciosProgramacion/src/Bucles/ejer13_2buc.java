/*
 * Proyecto UD3_ejercicios - Archivo ejer13_2buc.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 21:35:30
 */
package Bucles;

import java.util.Scanner;

public class ejer13_2buc {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;
        int total = 0;
        System.out.println("Dime un numero ");
        n = in.nextInt();
        do {
            total += (n % 10);
            n = n / 10;
        } while (n != 0);
        System.out.println(total);
    }

}
