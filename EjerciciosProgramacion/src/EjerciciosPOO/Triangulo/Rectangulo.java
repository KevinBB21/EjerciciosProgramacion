/*
 * Proyecto EjerciciosProgramacion - Archivo Rectangulo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package EjerciciosPOO.Triangulo;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 21:07:00
 */
public class Rectangulo {

    public int x1, y1, x2, y2;

    public void sumalado(int a, int b, int c, int d) {
        a = x1;
        b = x2;
        c = y1;
        d = y2;
        int e = Math.abs(b - a);
        int i = Math.abs(d - c);
        int suma = e + i;
        System.out.println("La suma de los lados es " + suma);
    }

    public void areas(int a, int b, int c, int d) {
        a = x1;
        b = x2;
        c = y1;
        d = y2;
        int e = Math.abs(b - a);
        int i = Math.abs(d - c);
        int area = e * i;
        System.out.println("El area de los lados es " + area);

    }
}
