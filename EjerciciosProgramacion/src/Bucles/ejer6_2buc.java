/*
 * Proyecto UD3_ejercicios - Archivo ejer6_2buc.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 19:13:06
 */
package Bucles;

import java.util.Scanner;

public class ejer6_2buc {

    public static void main(String[] args) {
        int A, B;
        int repeticiones = 1;
        int resultado = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero");
        A = in.nextInt();
        resultado = A;
        System.out.println("Dime otro numero");
        B = in.nextInt();

        do {
            resultado *= A;
            repeticiones++;
        } while (repeticiones != B);

        System.out.println(resultado);

    }

}
