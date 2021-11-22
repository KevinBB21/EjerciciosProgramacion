/*
 * Proyecto UD3_ejercicios - Archivo ejer3_4buc.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 17:36:52
 */
package Bucles;

import java.util.Scanner;

public class ejer3_4buc {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        for (int i = 1; i < 10; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 0; j < 10; j++) {
                
                System.out.print(i + "x" + j + "=" + (i * j));
                System.out.println(" ");

                
            }
            System.out.println(" ");
        }

    }
}
