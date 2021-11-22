/**
 * Proyecto Strings - Archivo Strings6.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package strings;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 3 nov. 2021 21:28:08
 */
import java.util.Scanner;

public class Strings8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dime una cadena de texto");
        String s1 = in.nextLine();

        System.out.println("Dime una palabra");
        String s2 = in.nextLine();

        int contador = 0;
        int posicion = 0;
        while (posicion != -1) {
            posicion = (s1.indexOf(s2, (posicion + 1 )));
            contador++;
// mal
        }
        System.out.println(contador);
    }
}
