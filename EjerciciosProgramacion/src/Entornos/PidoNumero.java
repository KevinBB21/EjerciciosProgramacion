/*
 * Proyecto UD3_ejercicios - Archivo PidoNumero.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Entornos;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 3 nov. 2021 16:52:59
 */
import java.util.Scanner;

public class PidoNumero {

    public static void main(String[] args) {
int[] m = new int[10];
for (int i = 0; i < m.length; i++)
    m[i] = i + 1;
for (int i = 1; i < m.length; i += 2)
    System.out.print(m[i] + " ");
    }
}
