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

    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.out.println("Excepcion en metodo ( ) ");
            e.printStackTrace();
        }
    }

    private static int metodo() throws NumberFormatException {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor al final del try : " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor al final del catch :" + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor al final de finally :" + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return : " + valor);
        return valor;
    }
}
