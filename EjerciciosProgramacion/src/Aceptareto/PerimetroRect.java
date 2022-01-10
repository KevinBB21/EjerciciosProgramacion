/*
 * Proyecto EjerciciosProgramacion - Archivo PerimetroRect.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Aceptareto;

import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 15 dic. 2021 16:46:11
 */
public class PerimetroRect {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1;
        int n2;
        int cont = 0;
        do {
            n1 = in.nextInt();
            n2 = in.nextInt();
            if (n1 >= 0 && n2 >= 0 ) {
                int suma = n1 * 2 + n2 *2;
                System.out.println(suma);
            }
            else {
                cont++;
            }

        } while (cont == 0);  
        
        
    }

}
