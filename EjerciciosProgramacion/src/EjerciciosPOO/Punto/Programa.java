/*
 * Proyecto EjerciciosProgramacion - Archivo Programa.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package EjerciciosPOO.Punto;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:02:06
 */
public class Programa {
    public static void main(String[] args) {
        
        Punto p1 = new Punto();
        p1.x = 5;
        p1.y = 10;
        
        
        Punto p2 = new Punto();
        p2.x = 10;
        p2.y = 10;
        
        Punto p3 = new Punto();
        p3.x = -3;
        p3.y = 7;
        
        System.out.println("("+ p1.x + "," + p1.y + ")");
        System.out.println("("+ p2.x + "," + p2.y + ")");
        System.out.println("("+ p3.x + "," + p3.y + ")");
     
        p2.x *= 3;
        System.out.println(p2.x);
        
    }
}
