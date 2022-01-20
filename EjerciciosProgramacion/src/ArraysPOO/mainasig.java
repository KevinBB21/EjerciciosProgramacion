/*
 * Proyecto EjerciciosProgramacion - Archivo mainasig.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ArraysPOO;

import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 20 ene. 2022 18:48:56
 */
public class mainasig {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Asignatura [] arrayAsignatura = new Asignatura[5];
        
        arrayAsignatura[0] = new Asignatura("Pedro",827437,22);
        arrayAsignatura[1] = new Asignatura("Juan",234589,19);
        arrayAsignatura[2] = new Asignatura("Toni",276573,32);
        arrayAsignatura[3] = new Asignatura("Carlos",276563,29);
        arrayAsignatura[4] = new Asignatura("Paco",232326,37);
        
        
        for (int i = 0; i < arrayAsignatura.length; i++) {
            arrayAsignatura[i].imprime();
        }
        
        
        Asignatura [] va2 = new Asignatura[5];
        
        for (int i = 0; i < va2.length; i++) {
            System.out.print("Dime nombre: ");
            String n = in.nextLine();
            System.out.print("Dime codigo: ");
            int co = in.nextInt();
            System.out.print("Dime curso: ");
            int cu = in.nextInt();
                        
            va2[i] = new Asignatura(n, co, cu);
            
        }
        
    }
}
