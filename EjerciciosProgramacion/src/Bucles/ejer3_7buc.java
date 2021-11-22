/*
 * Proyecto UD3_ejercicios - Archivo ejer3_7buc.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */


/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 20:15:46
 */
package Bucles;

import java.util.Scanner;

public class ejer3_7buc {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    
                
                System.out.print(i + ":" + j + ":" + k);
                System.out.println(" ");

                }   
            }
            System.out.println(" ");
        }

    }
}
