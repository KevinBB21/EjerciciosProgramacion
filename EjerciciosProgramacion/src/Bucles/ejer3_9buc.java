/*
 * Proyecto UD3_ejercicios - Archivo ejer3_9buc.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 20:47:51
 */
package Bucles;

import java.util.Scanner;

public class ejer3_9buc {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x;
        char signo = '*';
        char spacio = ' ';
        System.out.println("Dime un numero");
        x = in.nextInt();
        int act = x -1;
        for (int k = 0; k < x; k++) {

            for (int i = act; i > 0; i--) {
                System.out.print(spacio);

            }
            for (int j = 0; j <= k; j++) {
                System.out.print(signo);

            }
            System.out.println("");
            act--;
            
        }

    }

}
