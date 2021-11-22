/*
 * Proyecto UD3_ejercicios - Archivo ejer3_8buc.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 20:18:36
 */
package Bucles;

import java.util.Scanner;

public class ejer3_8buc {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int mes = 1;
        for (mes = 1; mes <= 12; mes++) {
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    for (int i = 1; i <= 31; i++) {
                        System.out.println(i +"/" +mes);

                    }
                    break;
                case 2:
                    for (int i = 1; i <= 28; i++) {
                        System.out.println(i+ "/" + mes);

                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    for (int i = 1; i <= 30; i++) {
                        System.out.println(i+ "/"+ mes);

                    }
                    break;
            }

        }
    }

}
