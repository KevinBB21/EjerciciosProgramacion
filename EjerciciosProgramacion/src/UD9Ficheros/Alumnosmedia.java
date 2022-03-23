/*
 * Proyecto EjerciciosProgramacion - Archivo Alumnosmedia.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD9Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 21 mar. 2022 20:29:10
 */
public class Alumnosmedia {

    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("Documentos/alumnos_notas.txt");

        Scanner leedorArchivo = new Scanner(f);
    }
}