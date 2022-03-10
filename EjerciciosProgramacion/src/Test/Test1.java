/*
 * Proyecto EjerciciosProgramacion - Archivo Test1.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Test;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 28 feb. 2022 19:34:21
 */
public class Test1 {

    // Devuelve ‘true’ si en ‘tira’ hay algún carácter mayor que ‘letra’
// y devuelve ‘false’ en caso contrario.
public static boolean hay_mayor_tira(char[] tira, char letra) {
        boolean encontrado = false;
        int i = 0;
        while ((!encontrado) && (i < tira.length)) {
            if (tira[i] > letra) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }
}
