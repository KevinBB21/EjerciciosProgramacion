/*
 * Proyecto EjerciciosProgramacion - Archivo Fich1.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD9Ficheros;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 10 mar. 2022 18:52:03
 */
import java.io.File; 
 
public class Fich1 { 
 
public static void main(String[] args) { 
// Dos rutas absolutas 
File carpetaAbs = new File("/home/lionel/fotos"); 
File archivoAbs = new File("/home/lionel/fotos/albania1.jpg"); 
 
// Dos rutas relativas 
File carpetaRel = new File("trabajos"); 
File fitxerRel = new File("trabajos/documento.txt"); 
 
// Mostrem sus rutas 
mostrarRutas(carpetaAbs); 
mostrarRutas(archivoAbs); 
mostrarRutas(carpetaRel); 
mostrarRutas(fitxerRel); 
} 
 
public static void mostrarRutas(File f) { 
System.out.println("getParent() : " + f.getParent()); 
System.out.println("getName() : " + f.getName() + "\n"); 
System.out.println("getAbsolutePath(): " + f.getAbsolutePath()); 
} 
}
