/*
 * Proyecto EjerciciosProgramacion - Archivo Envases.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Aceptareto;

import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 15 dic. 2021 20:30:39
 */
public class Envases {

    

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int veces;
        veces = in.nextInt();
        for (int i = 1; i <= veces; i++) {
        
        int productoneto = in.nextInt();
        int producto = in.nextInt();
        
        int resultado = producto - productoneto;
            System.out.println(resultado);
            
        }

    }

}
