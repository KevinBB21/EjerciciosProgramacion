/*
 * Proyecto EjerciciosProgramacion - Archivo Fich2.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD9Ficheros;

import java.io.File;
import java.util.Date;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 10 mar. 2022 18:54:09
 */
public class Fich2 {

    public static void main(String[] args) {
        File documento = new File("C:/Temp/Documento.txt");
        System.out.println(documento.getAbsolutePath());

        long milisegundos = documento.lastModified();
        Date fecha = new Date(milisegundos);

        System.out.println("Última modificación (ms) : " + milisegundos);
        System.out.println("Última modificación (fecha): " + fecha);
        System.out.println("Tamaño del archivo: " + documento.length());
    }
}
