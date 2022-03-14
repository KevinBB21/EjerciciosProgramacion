/*
 * Proyecto EjerciciosProgramacion - Archivo MiniTerminal.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD9Ficheros;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 14 mar. 2022 19:46:38
 */
public class MiniTerminal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MiniFileManager ruta = new MiniFileManager();

        int cuantos = 1;
        File f = new File(".");
        do {

            System.out.println("De las siguientes opciones elige cual deseas usar");
            System.out.println("1. pwd");
            System.out.println("2. cd");
            System.out.println("3. ls");
            System.out.println("4. ll");
            System.out.println("5. mkdir");
            System.out.println("6. rm");
            System.out.println("7. mv");
            System.out.println("8. help");
            System.out.println("9. exit");

            int opcion;
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    ruta.imprimePWD();
                    break;
                case 2:

                    break;
                case 3:
                    ruta.printList(false);

                    break;
                case 4:
                    ruta.printList(true);

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    System.out.println("● pwd: Muestra cual es la carpeta actual.\n"
                            + "● cd <DIR>: Cambia la carpeta actual a ‘DIR’. Con .. cambia a la carpeta superior.\n"
                            + "● ls: Muestra la lista de directorios y archivos de la carpeta actual (primero directorios, luego\n"
                            + "archivos, ambos ordenados alfabéticamente).\n"
                            + "● ll: Como ls pero muestra también el tamaño y la fecha de última modificación.\n"
                            + "● mkdir <DIR>: Crea el directorio ‘DIR’ en la carpeta actual.\n"
                            + "● rm <FILE>: Borra ‘FILE’. Si es una carpeta, borrará primero sus archivos y luego la carpeta. Si\n"
                            + "tiene subcarpetas, las dejará intactas y mostrará un aviso al usuario.\n"
                            + "● mv <FILE1> <FILE2>: Mueve o renombra ‘FILE1’ a ‘FILE2’.\n"
                            + "● help: Muestra una breve ayuda con los comandos disponibles.\n"
                            + "● exit: Termina el programa.");

                    break;
                case 9:
                    cuantos++;
                    System.out.println("Gracias por usar la miniterminal");
                    break;

            }
        } while (cuantos == 1);
    }
}
