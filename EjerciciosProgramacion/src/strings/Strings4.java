/*
 * Proyecto Strings - Archivo Strings4.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package strings;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 3 nov. 2021 21:33:39
 */
import java.util.Scanner;

public class Strings4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String s1 = in.nextLine();

        System.out.println("Dime tu apellido");
        String s2 = in.nextLine();

        System.out.println("Dime tu otro apellido");
        String s3 = in.nextLine();

        String s9=s1.substring(0,3);
        String s8=s2.substring(0,3);
        String s7=s3.substring(0,3);
        String s5;
        s5 = s9 + s8 + s7;
        
        System.out.println(s5);
    }

}
