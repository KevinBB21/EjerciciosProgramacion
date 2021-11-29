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
    public static int Pastillas = -1;
    public static int Fruta = 5;
    public static int Pared = -5;
    public static int Nada = 7;
    
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

    public static void Pac() {
        char $ = 36;

    }

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

    public static void imprimirTablero(String[][] tablero, int PacmanF, int PacmanC) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (i == PacmanF && j == PacmanC) {
                    System.out.print("< ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    public static String[][] dameTablero() {

        String[][] tablero1 = {
            {"F", "F", "F", "F", "F", "F"},
            {"F", "-", "-", "-", "-", "F"},
            {"F", "-", "-", "-", "-", "F"},
            {"F", "-", "-", "-", "-", "F"},
            {"F", "-", "-", "-", "-", "F"},
            {"F", "F", "F", "F", "F", "F"}
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

        // mostrar tablero
        imprimirTablero(tablero, PacmanF, PacmanC);

        // preguntar movimiento
        moverPacman();
        // comprobar movimiento
        imprimirTablero(tablero,PacmanF, PacmanC);
        // mover a pacman
        // mover fantasmas
        System.out.println(PacmanF);
        System.out.println(PacmanC);
        // lo que sea que suceda después del movimiento
    }

}
