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

public class Strings9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dime una cadena de texto");
        String s1 = in.nextLine();

        for (int i = 0; i < s1.length(); i++) {

            char c = s1.charAt(i);

            if (c == ' ') {
                System.out.println("");

            } else {
                System.out.print(c);
            }

        }

    }
}
