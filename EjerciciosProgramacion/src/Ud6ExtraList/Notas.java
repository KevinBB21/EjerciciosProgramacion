/*
 * Proyecto EjerciciosProgramacion - Archivo Notas.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Ud6ExtraList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 9 feb. 2022 21:00:20
 */
public class Notas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nota;
        int aprobado = 0, suspendidos = 0, ceros = 0, dieces = 0;
        double media = 0;
        
        ArrayList<Integer> notas = new ArrayList();

        do {
            nota = in.nextInt();
            
            if (nota >= 0 && nota <= 10 && nota != -1) {
                notas.add(nota);
                media += nota;
                if (nota >= 5) {
                    aprobado++;

                }
                
                if (nota < 5) {
                    suspendidos++;

                }
                
                if (nota == 0) {
                    ceros++;

                }
                
                if (nota == 10) {
                    dieces++;

                } 
                media = media / notas.size();
            } else {
                    System.out.println("Error no es una nota valida");
            }
                
            
        } while (nota != -1);
        System.out.println( aprobado + " " + suspendidos + " " + ceros + " " + dieces + " " + media);
        for (int i = 0; i < notas.size(); i++) {
            System.out.println(notas.get(i));
        }
    }

}
