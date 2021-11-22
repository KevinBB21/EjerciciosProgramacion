/*
 * Proyecto UD3_ejercicios - Archivo ejer7_2buc.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 19:42:38
 */
package Bucles;

import java.util.Scanner;

public class ejer7_2buc {

    public static void main(String[] args) {
        int N;
        int multi = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero");
        N = in.nextInt();
        do { 
        multi *= N;    
        N--;
        } while (N != 0);
        System.out.println(multi);
    }

}
