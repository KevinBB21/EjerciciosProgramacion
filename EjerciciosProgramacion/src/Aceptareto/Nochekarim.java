/*
 * Proyecto EjerciciosProgramacion - Archivo Nochekarim.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Aceptareto;

import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 15 dic. 2021 17:07:02
 */
public class Nochekarim {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String time , h , m;

        do {
            time = in.nextLine();
            String[] T = time.split(":");
            h = T[0];
            m = T[1];
            int hor = Integer.parseInt(h);
            int min = Integer.parseInt(m);
            if (hor < 24 && min < 60) {
                int restah = 24 - hor;
                int resh = restah *60;
                
                
            }
        } while ();

    }
}
