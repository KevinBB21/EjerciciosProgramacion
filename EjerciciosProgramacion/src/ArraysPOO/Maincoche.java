/*
 * Proyecto EjerciciosProgramacion - Archivo Maincoche.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package ArraysPOO;

import java.util.Scanner;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 20 ene. 2022 19:03:37
 */
public class Maincoche {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Coche difcoche[] = new Coche[1];
        
        int conttoriesgo = 0;
        int conttercer = 0;
        for (int i = 0; i < difcoche.length; i++) {
            in.nextLine();
            System.out.println("Dime el modelo: ");
            String mod = in.nextLine();
            System.out.println("Dime el color: ");
            String col = in.nextLine();
            System.out.println("Tiene pintura metalizada?");
            boolean metal = in.nextBoolean();
            in.nextLine();
            System.out.println("Dime la matricula: ");
            String mat = in.nextLine();
            System.out.println("Dime el año de fabricación: ");
            int añofab = in.nextInt();
            System.out.println("Dime que tipo de coche es entre estas opciones 1 MINI, 2 UTILITARIO, 3 FAMILIAR, 4 DEPORTIVO");
            int cotip = in.nextInt();
            tipoCoche tc = null;
            switch (cotip) {
                case 1:
                    tc = tipoCoche.MINI;
                    break;
                case 2:
                    tc = tipoCoche.UTILITARIO;
                    break;
                case 3:
                    tc = tipoCoche.FAMILIAR;
                    break;
                case 4:
                    tc = tipoCoche.DEPORTIVO;
                    break;
            }

            System.out.println("Dime la modalidad del seguro entre estas opciones 1. TERCEROS, 2. TODO_RIESGO");
            int moseg = in.nextInt();
            modalidadSeguro ms = null;
            switch (moseg) {
                case 1:
                    if (moseg == 1){
                        conttercer ++;
                    }
                        
                    ms = modalidadSeguro.TERCEROS;
                    break;
                case 2:
                    if (moseg == 2){
                        conttoriesgo ++;
                    }
                    ms = modalidadSeguro.TODO_RIESGO;
                    break;

            }

            difcoche[i] = new Coche(mod, col, metal, mat, añofab, tc, ms);

        }
        
        for (int i = 0; i < difcoche.length; i++) {
            System.out.println("Coche numero: " + i);
            difcoche[i].imprime();
        }

        int contmetal = 0;
        for (int i = 0; i < difcoche.length; i++) {
            if (difcoche[i].getPintura() == true) {
                contmetal++;
                System.out.println("Hay estos coches metalizados: "+contmetal);
            }

        }
        int cviejo = 0;
        for (int i = 0; i < difcoche.length; i++) {
            if (difcoche[i].getAñoFabricacion() < 2000) {
                cviejo++;
                System.out.println("Estos coches son anteriores al año 2000: "+cviejo);
            }

        }
        
        System.out.println("A terceros la cantidad es: " + conttercer +" Y para los a todo riesgo es: " + conttoriesgo);

    }
}
