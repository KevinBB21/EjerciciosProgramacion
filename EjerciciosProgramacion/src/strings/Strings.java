/*
 * Proyecto Strings - Archivo Strings.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package strings;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 3 nov. 2021 21:12:11
 */
import java.util.Scanner;

public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dime una cadena de texto");
        String s1 = in.nextLine();
        
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
    }

}
