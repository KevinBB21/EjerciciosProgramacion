/*
 * Proyecto Strings - Archivo CasoPractico.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 11 nov. 2021 19:30:46
 */
public class CasoPractico {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean salir = false;
        int opcion;
        String[] nombres = new String[100];
        int[] telefono = new int[100];
        String[] gmail = new String[100];
        int max = 100;
        int contador = 0;
        do {
            System.out.println("1. Ver contactos");
            System.out.println("2. Agregar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Ver contactos");
            System.out.println("5. Ver contactos");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    for (int i = 0; i < contador; i++) {
                        
                    }
                    
                    break;
                case 2:
                    in.nextLine();
                    System.out.println("Dime su nombre");
                    nombres[contador] = in.nextLine();

                    System.out.println("Dime su telefono");
                    telefono[contador] = in.nextInt();

                    System.out.println("Dime su gmail");
                    gmail[contador] = in.nextLine();

                    contador++;
                    break;

                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:

            }

        } while (!salir);
        {

        }

    }

}
