/*
 * Proyecto EjerciciosProgramacion - Archivo Prueba1.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD9Ficheros;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 10 mar. 2022 19:07:33
 */
public class Prueba1 {

    public static void main(String[] args) throws IOException {

        File ficherou = new File("C:directorio");
        File directoriou = new File("C:carpetapeta");
        
        ficherou.createNewFile();
        directoriou.mkdir();
        
        
    }
}
