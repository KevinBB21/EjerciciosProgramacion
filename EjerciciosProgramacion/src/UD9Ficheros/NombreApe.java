/*
 * Proyecto EjerciciosProgramacion - Archivo NombreApe.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD9Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 23 mar. 2022 20:47:35
 */
public class NombreApe {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File f1 = new File("Documentos/usa_nombres.txt");
        File f2 = new File("Documentos/usa_apellidos.txt");
        File f3 = new File("Documentos/randoms.txt");

        try {

            ArrayList<String> list = new ArrayList();
            ArrayList<String> list2 = new ArrayList();
            Scanner lectorArch1 = new Scanner(f1);
            Scanner lectorArch2 = new Scanner(f2);
            FileWriter writer = new FileWriter(f3);

            while (lectorArch1.hasNext()) {
                String mismoNom = lectorArch1.nextLine();
                System.out.println(mismoNom);
                list.add(mismoNom);                
            }
            
            while (lectorArch2.hasNext()){
                String mismoApe = lectorArch2.nextLine();
                System.out.println(mismoApe);
                list2.add(mismoApe);
            }
            int cuantos;
            lectorArch1.close();
            lectorArch2.close();

            Scanner in = new Scanner(System.in);
            
            cuantos = in.nextInt();
            int randnom;
            int randape;
            for (int i = 0; i < cuantos; i++) {
                randnom = (int) (Math.random() * list.size() + 1);
                randape = (int) (Math.random() * list2.size() + 1);
                writer.write(list.get(randnom) + " " + list2.get(randape) + "\n" );
            }

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
