/*
 * Proyecto EjerciciosProgramacion - Archivo Main.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package EjerciciosPOO.Triangulo;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 21:11:31
 */
public class Main {

    public static void main(String[] args) {

        Rectangulo c1 = new Rectangulo();
        c1.x1 = 0;
        c1.y1 = 0;
        c1.x2 = 5;
        c1.y2 = 5;

        Rectangulo c2 = new Rectangulo();
        c2.x1 = 7;
        c2.y1 = 9;
        c2.x2 = 2;
        c2.y2 = 3;

        
        c1.sumalado(c1.x1, c1.x2, c1.y1, c1.y2);
        c2.sumalado(c1.x1, c1.x2, c1.y1, c1.y2);

        c1.areas(c1.x1, c1.x2, c1.y1, c1.y2);
        c2.areas(c1.x1, c1.x2, c1.y1, c1.y2);
    }

}
