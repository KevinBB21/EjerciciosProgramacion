/*
 * Proyecto EjerciciosProgramacion - Archivo Colores.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Ud6ExtraList;

import java.util.ArrayList;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 9 feb. 2022 20:42:15
 */
public class Colores {
    public static void main(String[] args) {
        
        ArrayList<String> colores = new ArrayList();
        
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Naranja");
        colores.add("Blanco");
        
        for (int i = 0; i < colores.size(); i++) {
            

        System.out.println(colores.get(i));
        }
                    System.out.println("-----------------");
        
        colores.add("Negro");
        colores.add("Cyan");
        colores.add(0,"Amarillo");
        colores.add(1,"Magenta");
        System.out.println("---------------");
        for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }
                    System.out.println("-----------------");
        colores.remove(2);
        colores.remove(2);
        
        for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }
        
    }
}
