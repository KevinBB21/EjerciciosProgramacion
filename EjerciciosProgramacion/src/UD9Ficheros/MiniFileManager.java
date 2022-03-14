/*
 * Proyecto EjerciciosProgramacion - Archivo MiniFIleManager.java - Compañia DAW
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
 * @date 14 mar. 2022 19:46:47
 */
public class MiniFileManager {

    private static File RutaActual = new File("/datos/usuarios/alumnos/a023326273h/NetBeansProjects/EjerciciosProgramacion/EjerciciosProgramacion/src/UD9Ficheros");
    private String RutaNow = RutaActual.getAbsolutePath();
    File[] arrayArchivos = RutaActual.listFiles();
    
    public String getPWD() {
        return RutaActual.getAbsolutePath();
    }

    public void printList(boolean info) {
        if (info) {
            for (int i = 0; i < arrayArchivos.length; i++) {
                Date d = new Date(arrayArchivos[i].lastModified());
                String fechaMod = d.toString();
                System.out.println(arrayArchivos[i].getName() + " / " + arrayArchivos[i].length() + " Bytes / " + fechaMod);
            }
        } else {
            for (int i = 0; i < arrayArchivos.length; i++) {
                System.out.println(arrayArchivos[i].getName());
            }
        }
    }
    
    public void imprimePWD(){
        System.out.println(RutaActual.getAbsolutePath());
    }
    
    public static void mkdirDIR(String nombre){
      File nombre = new File(RutaActual.getAbsolutePath());   
      nombre.mkdir();
        System.out.println("Directorio creado");
    } 
    
    
    public boolean changeDir(String dir) {

    }

}
