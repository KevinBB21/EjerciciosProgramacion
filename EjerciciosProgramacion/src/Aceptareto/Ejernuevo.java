/*
 * Proyecto EjerciciosProgramacion - Archivo Ejernuevo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Aceptareto;

import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 16 dic. 2021 17:04:22
 */
public class Ejernuevo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int veces,n,f,t;
        veces = in.nextInt();
        for (int i = 1; i <= veces; i++) {
            n = in.nextInt();
            f = in.nextInt();
            t = in.nextInt();
            if (n == t) {
                int mult = t * f;
                System.out.println(mult);
                
            }
            else if(t > n){
                //int acum = t/n ;
                int rest= (t % (n +1)) * f;
                System.out.println(rest);        
                
            }
            else if (t < n) {
                int otro = t * f;
                System.out.println(otro);
                
            }

        }
        
        
    }
}
