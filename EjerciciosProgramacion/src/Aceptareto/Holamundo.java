/*
 * Proyecto EjerciciosProgramacion - Archivo Holamundo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Aceptareto;

import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 15 dic. 2021 16:14:34
 */
public class Holamundo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cont = 0;
        int n = in.nextInt();

        
        while (cont != n && n <= 5){
        
            System.out.println("Hola mundo.");
            cont++;
            
        }

    }

}
