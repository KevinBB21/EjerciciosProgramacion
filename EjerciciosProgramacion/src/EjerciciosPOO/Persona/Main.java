/*
 * Proyecto EjerciciosProgramacion - Archivo Main.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package EjerciciosPOO.Persona;

import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:16:13
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Persona karim = new Persona("karim", "apellido" , "sadadas", 154);
        //karim.nombre = in.nextLine();
        //karim.apellidos = in.nextLine();
        //karim.dni = in.nextLine();
        //karim.edad = in.nextInt();

        
        Persona carlitos = new Persona("carlitos","apellido","sdadsad",13);
        //carlitos.nombre = in.nextLine();
        //carlitos.apellidos = in.nextLine();
        //carlitos.dni = in.nextLine();
        //carlitos.edad = in.nextInt();
        
        System.out.println("Esta persona tiene estos datos :" + karim.getNombre() + ", " + karim.getApellidos() + ", " + karim.getDni() + ", " + karim.getEdad());
        karim.mayor(karim.getEdad());
        
        System.out.println("Esta persona tiene estos datos :" + carlitos.getNombre() + ", " + carlitos.getApellidos() + ", " + carlitos.getDni() + ", " + carlitos.getEdad());
        carlitos.mayor(carlitos.getEdad());

        System.out.println(karim.diferenciaEdad(carlitos));
        
    }
}
