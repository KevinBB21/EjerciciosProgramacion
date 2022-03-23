/*
 * Proyecto EjerciciosProgramacion - Archivo MaximoMinimo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD9Ficheros;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 21 mar. 2022 20:29:10
 */
public class MaximoMinimo {

    public static void main(String[] args) {

        File f = new File("Documentos/numeros.txt");
        int min = 10000, max = -1;

        try {

            Scanner leedorArchivo = new Scanner(f);
            while (leedorArchivo.hasNext()) {
                int mismo = leedorArchivo.nextInt();
                if (mismo < min) {
                    min = mismo;
                } else if (mismo > max) {
                    max = mismo;
                }

            }
            System.out.println("Este es el mayor: " + max);
            System.out.println("Este es el menor: " + min);
            leedorArchivo.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
