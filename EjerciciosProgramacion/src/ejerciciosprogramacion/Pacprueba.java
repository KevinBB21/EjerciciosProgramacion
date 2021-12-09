package ejerciciosprogramacion;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Pacprueba {

    public static int PacmanF = 1;
    public static int PacmanC = 1;
    public static int FantasmaF1 = 5;
    public static int FantasmaC1 = 5;
    public static int FantasmaF2 = 3;
    public static int FantasmaC2 = 1;
    public static int FantasmaF3 = 1;
    public static int FantasmaC3 = 3;

    /*public static int Pastillas = -1;
    public static int Fruta = 5;
    public static int Pared = -5;
    public static int Nada = 7;
     */
    public static void Puntuaciones() {
    int puntos;
    
    }
    
    public static void Desaparece(String[][] tablero){
        
        
    }

    // public static void Pastillas() {
    //   if (pacmanF )
    //  amcumulador de posicion anterior para asi cambiar el tablero y poner un espacio creando asi la sensacion de que se ha comido la pastilla       
    //    
    // }

    /*  public static void AcabarGanas() {
        int frutas = 4;
        while (frutas > 0) {
            System.out.println("Vamos te quedan menos frutas");
        }
        if (frutas == 0) {
            System.out.println("Has ganado , enhorabuena!");
        }
    }*/

 /*  public static int Puntos() {
        if ($) {

        }
    }*/

 /*public static void Pac() {
        char $ = 36;

    }*/
    public static void moverPacman(String[][] tablero) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dime tu siguiente movimiento , usando WASD");
        char letra;
        letra = in.next().charAt(0);

        switch (letra) {

            case 'w':
                if (tablero[PacmanF - 1][PacmanC].equals("F")) {

                } else {
                    PacmanF--;
                }

                break;

            case 'a':
                if (tablero[PacmanF][PacmanC - 1].equals("F")) {
                
                } else {

                    PacmanC--;
                }
                break;
            case 's':
                if (tablero[PacmanF + 1][PacmanC].equals("F")) {

                } else {
                    PacmanF++;
                }

                break;
            case 'd':
                if (tablero[PacmanF][PacmanC + 1].equals("F")) {

                } else {
                    PacmanC++;
                }

                break;
        }

    }

    public static void imprimirTablero(String[][] tablero) {
        int cont = 0;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                if (i == PacmanF && j == PacmanC) {

                    /*if (i == FantasmaF1 && j == FantasmaC1) {
                        System.out.print("୦ ");
                    
                    if (i == FantasmaF2 && j == FantasmaC2) {
                        System.out.print("୦ ");
                    
                    if (i == FantasmaF3 && j == FantasmaC3) {
                        System.out.print("୦ ");
                    }
                     */
                    if ((i == FantasmaF1) && (j == FantasmaC1) || (i == FantasmaF2) && (j == FantasmaC2) || (i == FantasmaF3) && (j == FantasmaC3)) {

                        System.out.print("୦ ");
                    } else {
                        System.out.print("< ");

                    }
                } else if (i == FantasmaF1 && j == FantasmaC1) {
                    System.out.print("$ ");
                    //} else if (PacmanF == FantasmaF1 && PacmanC == FantasmaC1) {
                    //    System.out.print("୦ ");
                } else if (i == FantasmaF2 && j == FantasmaC2) {
                    System.out.print("$ ");
                    //} else if (PacmanF == FantasmaF2 && PacmanC == FantasmaC2) {
                    //    System.out.print("୦ ");
                } else if (i == FantasmaF3 && j == FantasmaC3) {
                    System.out.print("$ ");
                    //} else if (PacmanF == FantasmaF3 && PacmanC == FantasmaC3) {
                    //    System.out.print("୦ ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }

            }
            System.out.println("");
        }

    }

    public static String[][] dameTablero() {

        String[][] tablero = {
            {"F", "F", "F", "F", "F", "F", "F", "F"},
            {"F", "-", "-", "-", "-", "-", "-", "F"},
            {"F", "-", "-", "-", "-", "-", "-", "F"},
            {"F", "-", "F", "F", "F", "F", "-", "F"},
            {"F", "-", "-", "-", "-", "-", "-", "F"},
            {"F", "-", "-", "-", "-", "-", "-", "F"},
            {"F", "-", "-", "-", "-", "-", "-", "F"},
            {"F", "F", "F", "F", "F", "F", "F", "F"}
        };

        String[][] tablero2 = {
            {"F", "F", "F"},
            {"F", "-", "F"},
            {"F", "F", "F"}
        };

        int[][] tablero3 = {
            {},
            {},
            {}
        };

        return tablero;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Crear tablero, pacman y fantasmas
        String[][] tablero = dameTablero();

        /*
        añadir fantasmas
         */
        // Rondas de la partida
        for (int i = 0; i < 1000; i++) {
            // mostrar tablero
            imprimirTablero(tablero);

            // preguntar movimiento
            moverPacman(tablero);
            // comprobar movimiento

            // mover a pacman
            // mover fantasmas
            System.out.println(PacmanF);
            System.out.println(PacmanC);
            // lo que sea que suceda después del movimiento
        }
    }

}
