/*
 * Proyecto EjerciciosProgramacion - Archivo OrdenandoArchivus.java - Compañia DAW
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
 * @date 23 mar. 2022 16:50:32
 */
public class OrdenandoArchivus {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File f1 = new File("Documentos/usa_personas.txt");
        File f2 = new File("Documentos/usa_personas_sorted.txt");

        try {

            ArrayList<String> list = new ArrayList();
            Scanner lectorArch = new Scanner(f1);
            FileWriter writer = new FileWriter(f2);

            while (lectorArch.hasNext()) {
                String mismo = lectorArch.nextLine();
                System.out.println(mismo);
                list.add(mismo + "\n");
                
                

            }
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i));
                
            }
            
            
            lectorArch.close();
            writer.close();
            
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
