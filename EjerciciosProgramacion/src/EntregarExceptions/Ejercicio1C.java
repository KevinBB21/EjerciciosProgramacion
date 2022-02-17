/*
 * Proyecto EjerciciosProgramacion - Archivo Ejercicio1C.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package EntregarExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 17 feb. 2022 20:14:36
 */
public class Ejercicio1C {

    public static void imprimePositivo(int p) throws Exception {
        if (p >= 0) {
            System.out.println(p);
        } else {
            throw new Exception("No es un numero positivo");
        }
    }

    public static void imprimeNegativo(int p) throws Exception {
        if (p < 0) {
            System.out.println(p);
        } else {
            throw new Exception("No es un numero negativo");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p;
        for (int i = 0; i < 10; i++) {
            
        
        try {
            p = in.nextInt();
            imprimeNegativo(p);
            imprimePositivo(p);
        } catch (InputMismatchException e) {
            System.out.println("No puede ser una letra");
        } catch (Exception e) {
            System.out.println("Hay un error el numero es negativo o positivo");
        }
        }
        try {
            p = in.nextInt();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            p = in.nextInt();
            imprimePositivo(p);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
