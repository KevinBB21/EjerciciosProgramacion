/*
 * Proyecto UD3_ejercicios - Archivo ejer9_2buc.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 20:22:48
 */
package Bucles;

import java.util.Scanner;

public class ejer9_2buc {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 1;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int contador6 = 0;
        do {
            int a = (int) (1 + (Math.random() * 6));
            n++;
            if (a == 1) {
                contador1++;

            } else if (a == 2) {
                contador2++;
            } else if (a == 3) {
                contador3++;
            } else if (a == 4) {
                contador4++;
            } else if (a == 5) {
                contador5++;
            } else if (a == 6) {
                contador6++;
            }
        } while (n != 101);
        System.out.println("De unos hay " + contador1);
        System.out.println("De doses hay " + contador2);
        System.out.println("De treses hay " + contador3);
        System.out.println("De cuatros hay " + contador4);
        System.out.println("De cincos hay " + contador5);
        System.out.println("De seises hay " + contador6);
    }

}
