/*
 * Proyecto EjerciciosProgramacion - Archivo cp.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Entornos;

/**
 *
 * @author Kevin
 */
import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 11 nov. 2021 19:30:46
 */
public class cp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean salir = false;
        int opcion;
        String[] nombres = new String[100];
        int[] dinero = new int[100];
        int contador = 0;
        int añadir;
        int posicion;
        do {
            System.out.println("1. Ver cuentas");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Agregar cuenta");
            System.out.println("5. Eliminar cuenta");
            System.out.println("6. Buscar cuenta");
            System.out.println("7. Mostrar morosos");
            System.out.println("8. Salir");
            opcion = in.nextInt();
            String respuesta;
            switch (opcion) {
                case 1:
                    for (int i = 0; i < contador; i++) {
                        System.out.println(i + "." + " " + nombres[i] + " " + dinero[i] + "€");

                    }
                    break;
                case 2:
                    in.nextLine();

                    System.out.println("Digame su posicion");
                    posicion = in.nextInt();
                    System.out.println("Dime la cantidad que quieres ingresar");
                    añadir = in.nextInt();

                    dinero[posicion] += añadir;
                    System.out.println(dinero[posicion]);

                    break;

                case 3:
                    in.nextLine();

                    System.out.println("Digame su posicion");
                    posicion = in.nextInt();
                    int quitar;
                    System.out.println("Dime la cantidad que quieres retirar");
                    quitar = in.nextInt();

                    dinero[posicion] -= quitar;
                    System.out.println(dinero[posicion]);

                    break;
                case 4:
                    in.nextLine();
                    System.out.println("Tu posicion es la siguiente " + contador);
                    System.out.println("Dime tu nombre");
                    nombres[contador] = in.nextLine();

                    System.out.println("Dime la cantidad que posees");
                    dinero[contador] = in.nextInt();

                    contador++;
                    break;
                case 5:
                    int pos;
                    System.out.println("Dime la posicion que deseas borrar");
                    pos = in.nextInt();
                    for (int i = pos; i < contador - 1; i++) {
                        nombres[i] = nombres[i + 1];
                        dinero[i] = dinero[i + 1];
                    }
                    contador--;
                    break;
                case 6:
                    in.nextLine();
                    System.out.println("Dime el nombre de la cuenta que buscas");
                    respuesta = in.nextLine();
                    for (int i = 0; i < contador; i++) {

                        if (nombres[i].toUpperCase().indexOf(respuesta.toUpperCase()) >= 0) {
                            System.out.println("Si existe este usuario " + nombres[i] + " Aqui esta su saldo " + dinero[i] + "€");
                        }
                    }

                    break;
                case 7:
                    for (int i = 0; i < contador; i++) {
                        if (dinero[i] < 0) {
                            System.out.println("Aqui estan los morosos: " + nombres[i]);
                        }

                    }

                    break;
                case 8:
                    salir = true;

                    break;
                default:

            }

        } while (!salir);
        {
            System.out.println("Gracias por su visita");

        }

    }

}