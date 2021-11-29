package ejerciciosprogramacion;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Pacman {

    public static int PacmanF = 1;
    public static int PacmanC = 1;
    public static int FantasmaF1 = 5;
    public static int FantasmaC1 = 5;
    public static int FantasmaF2 = 3;
    public static int FantasmaC2 = 1;
    public static int FantasmaF3 = 1;
    public static int FantasmaC3 = 3;
    public static int Pastillas = -1;
    public static int Fruta = 5;
    public static int Pared = -5;
    public static int Nada = 7;

    public static void Pastillas() {

    }

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
    public static void moverPacman() {
        Scanner in = new Scanner(System.in);

            System.out.println("Dime tu siguiente movimiento , usando WASD");
            char letra;
            letra = in.next().charAt(0);

            switch (letra) {
                case 'w':
                    PacmanF--;
                    break;
                case 'a':
                    PacmanC--;
                    break;
                case 's':
                    PacmanF++;
                    break;
                case 'd':
                    PacmanC++;
                    break;
            }

        

    }

    public static void imprimirTablero(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (i == PacmanF && j == PacmanC) {
                    System.out.print("< ");
                } else if (i == FantasmaF1 && j == FantasmaC1) {
                    System.out.print("$ ");
                }
                else if( i == FantasmaF2 && j == FantasmaC2){
                    System.out.print("$ ");
                }
                else if(i == FantasmaF3 && j == FantasmaC3){
                    System.out.print("$ ");
                }
                else {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    public static String[][] dameTablero() {

        String[][] tablero1 = {
            {"F", "F", "F", "F", "F", "F", "F", "F"},
            {"F", "-", "-", "-", "-", "-", "-", "F"},
            {"F", "-", "-", "-", "-", "-", "-", "F"},
            {"F", "-", "-", "-", "-", "-", "-", "F"},
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

        return tablero1;

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
            moverPacman();
            // comprobar movimiento
        
            // mover a pacman
            // mover fantasmas
            System.out.println(PacmanF);
            System.out.println(PacmanC);
            // lo que sea que suceda después del movimiento
        }
    }

}
