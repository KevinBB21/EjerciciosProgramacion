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
        
        Punto p1 = new Punto(5, 10);
        //p1.x = 5;
        //p1.y = 10;
        
        
        Punto p2 = new Punto(10, 10);
        //p2.x = 10;
        //p2.y = 10;
        
        Punto p3 = new Punto(-3, 7);
        //p3.x = -3;
        //p3.y = 7;
        
        System.out.println("("+ p1.getX() + "," + p1.getY() + ")");
        System.out.println("("+ p2.getX() + "," + p2.getY() + ")");
        System.out.println("("+ p3.getX() + "," + p3.getY() + ")");
     
        p2.setX(p2.getX()*3);
        //this.setX() = this.getX() * 3;
        System.out.println(p2.getX());
        
        p1.setXY(0,0);
        p2.setXY(2,2);
        
        System.out.println(p1.distancia(p2));
    }
}
