/*
 * Proyecto EjerciciosProgramacion - Archivo Maindni.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package ArraysPOO;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 24 ene. 2022 19:18:03
 */
public class Maindni {

    public static void main(String[] args) {
        int letras = 0;

        Dni d1 = Dni.newRandomDNI();
        d1.imprime();

        Dni numrdm[] = new Dni[10000];

        for (int i = 0; i < numrdm.length; i++) {
            numrdm[i] = Dni.newRandomDNI();
            numrdm[i].imprime();

        }
        

    }
}
