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

        Rectangulo c1 = new Rectangulo(0, 0, 5, 5);
        //c1.x1 = 0;
        //c1.y1 = 0;
        //c1.x2 = 5;
        //c1.y2 = 5;

        Rectangulo c2 = new Rectangulo(2, 3, 7, 9);
        //c2.x1 = 7;
        //c2.y1 = 9;
        //c2.x2 = 2;
        //c2.y2 = 3;
        

       //System.out.println(c1.getX1() + " " + c1.getX2() + " " + c1.getY1() + " " + c1.getY2());
        //System.out.println(c2.getX1() + " " + c2.getX2() + " " + c2.getY1() + " " + c2.getY2());

       // c1.sumalado(c1.getX1(), c1.getX2(), c1.getY1(), c1.getY2());
       // c2.sumalado(c2.getX1(), c2.getX2(), c2.getY1(), c2.getY2());

       c1.areas(c1.getX1(), c1.getX2(), c1.getY1(), c1.getY2());
       c2.areas(c2.getX1(), c2.getX2(), c2.getY1(), c2.getY2());
        
       // c2.setX1(5);
        
        c1.setX1Y1(2, 2);
        c1.setX2Y2(6, 6);
        
        c1.imprimir();
        
        System.out.println(c1.areas(2,2,2,2));
        
        c1.setX1X2Y1Y2(5,8,3,9);
        c1.imprimir();
    }

}
