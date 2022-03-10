/*
 * Proyecto EjerciciosProgramacion - Archivo Yepa.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Test;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 3 mar. 2022 16:10:37
 */
public class Yepa {

    public static int buscar_en(char[] cadena, char letra) {
        int contador = 0, i = 0;
        if (cadena.length > 0) {
            do {
                if (cadena[i] == letra) {
                    contador++;
                }
                i++;
            } while (i < cadena.length);
        }
        return contador;
    }
}
