/*
 * Proyecto EjerciciosProgramacion - Archivo main.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package EjerciciosPOO.Articulo;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 21:29:30
 */
public class Main {
    public static void main(String[] args) {
        
     Articulo n1 = new Articulo("pepito" , 20 ,-5);   
        System.out.println("Nombre del comprador "+n1.getNombre() + " Precio con IVA: " +(n1.getPrecio() * 1.21)+"€" + " Stock disponible  " + n1.getStock());
    
    
    n1.setPrecio(-55);
        System.out.println(n1.getPrecio());
    }
}
