/*
 * Proyecto EjerciciosProgramacion - Archivo Botellaganadora.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Aceptareto;

import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 15 dic. 2021 20:51:28
 */
public class Botellaganadora {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int veces;

        veces = in.nextInt();
        for (int i = 1; i <= veces; i++) {
            int kilos;
            int posicion = 0;
            int sumatorio = 0;
            int cont = 1;
            kilos = in.nextInt();
            int botellas;
            do {

                botellas = in.nextInt();
                sumatorio += botellas;
                if (botellas / 8 == kilos || sumatorio / 8 >= kilos) {
                    posicion = cont;

                    cont++;
                    

                }

            } while (botellas != 0);
            System.out.println(posicion);
        }

    }

}
