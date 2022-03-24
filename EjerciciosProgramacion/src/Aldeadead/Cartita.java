/*
 * Proyecto EjerciciosProgramacion - Archivo Cartita.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Aldeadead;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 24 mar. 2022 18:26:04
 */
public class Cartita {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        File f = new File("carta-cifrada.txt");
        char[] letras = new char[26];
        letras[0] = 'A';
        letras[1] = 'B';
        letras[2] = 'C';
        letras[3] = 'D';
        letras[4] = 'E';
        letras[5] = 'F';
        letras[6] = 'G';
        letras[7] = 'H';
        letras[8] = 'I';
        letras[9] = 'J';
        letras[10] = 'K';
        letras[11] = 'L';
        letras[12] = 'M';
        letras[13] = 'N';
        letras[14] = 'O';
        letras[15] = 'P';
        letras[16] = 'Q';
        letras[17] = 'R';
        letras[18] = 'S';
        letras[19] = 'T';
        letras[20] = 'U';
        letras[21] = 'V';
        letras[22] = 'W';
        letras[23] = 'X';
        letras[24] = 'Y';
        letras[25] = 'Z';
        String palabra;
        int clave;

        try {
            System.out.println("Dime el numero clave");
            clave = in.nextInt();
            Scanner leedorArchivo = new Scanner(f);
            while (leedorArchivo.hasNext()) {
                palabra = leedorArchivo.next();
                for (int i = 0; i < palabra.length(); i++) {

                    char actual = palabra.charAt(i);
                    System.out.print(actual);
                }

                   /* for (int j = 0; j < 25; j++) {
                        if (actual == letras[j]) {
                            
                            actual = letras[j - clave];
                            if(letras[j - clave] < 0){
                                actual = letras[clave - j];
                                System.out.print(actual);                                
                            }else{
                                System.out.print(actual);   
                            }
                            
                        }
                     System.out.println(" ");

                    }*/
                   
                for (int i = 0; i < 10; i++) {
                    
                }
   

                
                System.out.print(" ");
            }
            leedorArchivo.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
  /*  public char Cambiochar(){
        for (int j = 0; j < 25; j++) {
                        if (actual == letras[j]) {

                            actual = letras[j - clave];
                            if(letras[j - clave] < 0){
                                actual = letras[clave - j];
                                System.out.print(actual);
                                
                            }else{
                                System.out.print(actual);   
                            }
                            
                        }
                        System.out.println(" ");

                    }
    }*/
}
