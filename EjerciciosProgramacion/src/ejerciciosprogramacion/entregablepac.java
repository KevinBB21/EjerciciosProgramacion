/*
 * Proyecto EjerciciosProgramacion - Archivo entregablepac.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package ejerciciosprogramacion;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class entregablepac {

    public static int PacmanF = 1;
    public static int PacmanC = 1;
    public static int FantasmaF1 = 5;
    public static int FantasmaC1 = 5;
    public static int FantasmaF2 = 3;
    public static int FantasmaC2 = 1;
    public static int FantasmaF3 = 1;
    public static int FantasmaC3 = 3;
    public static int Puntuacion;
    public static boolean Muerte = false;

    //public static boolean nomover = false;

    /*public static int Pastillas = -1;
    public static int Fruta = 5;
    public static int Pared = -5;
    public static int Nada = 7;
     */
    // Movimiento del fanstasma 1 aleatorio
    public static void FantasmaMovimiento1(String[][] tablero) {
        double x = (double) (Math.random() * +1);

        //if (tablero[FantasmaF1 - 1][FantasmaC1].equals("F") || tablero[FantasmaF2 - 1][FantasmaC2].equals("F") || tablero[FantasmaF3 - 1][FantasmaC3].equals("F") || tablero[FantasmaF1 + 1][FantasmaC1].equals("F") || tablero[FantasmaF2 + 1][FantasmaC2].equals("F") || tablero[FantasmaF3 + 1][FantasmaC3].equals("F") || tablero[FantasmaF1][FantasmaC1 + 1].equals("F") || tablero[FantasmaF2][FantasmaC2 + 1].equals("F") || tablero[FantasmaF3][FantasmaC3 + 1].equals("F") || tablero[FantasmaF1][FantasmaC1 - 1].equals("F") || tablero[FantasmaF2][FantasmaC2 - 1].equals("F") || tablero[FantasmaF3][FantasmaC3 - 1].equals("F")) {
        //}
        if (x < 0.25) {
            if (tablero[FantasmaF1 - 1][FantasmaC1].equals("F")) {

            } else {
                FantasmaF1--;
            }

        }
        if (x > 0.25 && x < 0.5) {
            if (tablero[FantasmaF1 + 1][FantasmaC1].equals("F")) {

            } else {
                FantasmaF1++;
            }

        }
        if (x > 0.5 && x < 0.75) {
            if (tablero[FantasmaF1][FantasmaC1 - 1].equals("F")) {

            } else {
                FantasmaC1--;
            }

        }
        if (x > 0.75 && x < 1) {
            if (tablero[FantasmaF1][FantasmaC1 + 1].equals("F")) {

            } else {
                FantasmaC1++;
            }

        }

    }

    // Movimiento del fanstasma 2 aleatorio
    public static void FantasmaMovimiento2(String[][] tablero) {
        double x = (double) (Math.random() * +1);

        //if (tablero[FantasmaF1 - 1][FantasmaC1].equals("F") || tablero[FantasmaF2 - 1][FantasmaC2].equals("F") || tablero[FantasmaF3 - 1][FantasmaC3].equals("F") || tablero[FantasmaF1 + 1][FantasmaC1].equals("F") || tablero[FantasmaF2 + 1][FantasmaC2].equals("F") || tablero[FantasmaF3 + 1][FantasmaC3].equals("F") || tablero[FantasmaF1][FantasmaC1 + 1].equals("F") || tablero[FantasmaF2][FantasmaC2 + 1].equals("F") || tablero[FantasmaF3][FantasmaC3 + 1].equals("F") || tablero[FantasmaF1][FantasmaC1 - 1].equals("F") || tablero[FantasmaF2][FantasmaC2 - 1].equals("F") || tablero[FantasmaF3][FantasmaC3 - 1].equals("F")) {
        //}
        if (x < 0.25) {
            if (tablero[FantasmaF2 - 1][FantasmaC2].equals("F")) {

            } else {
                FantasmaF2--;
            }

        }
        if (x > 0.25 && x < 0.5) {
            if (tablero[FantasmaF2 + 1][FantasmaC2].equals("F")) {

            } else {
                FantasmaF2++;
            }

        }
        if (x > 0.5 && x < 0.75) {
            if (tablero[FantasmaF2][FantasmaC2 - 1].equals("F")) {

            } else {
                FantasmaC2--;
            }

        }
        if (x > 0.75 && x < 1) {
            if (tablero[FantasmaF2][FantasmaC2 + 1].equals("F")) {

            } else {
                FantasmaC2++;
            }

        }

    }

    // Movimiento del fanstasma 3 aleatorio
    public static void FantasmaMovimiento3(String[][] tablero) {
        double x = (double) (Math.random() * +1);

        //if (tablero[FantasmaF1 - 1][FantasmaC1].equals("F") || tablero[FantasmaF2 - 1][FantasmaC2].equals("F") || tablero[FantasmaF3 - 1][FantasmaC3].equals("F") || tablero[FantasmaF1 + 1][FantasmaC1].equals("F") || tablero[FantasmaF2 + 1][FantasmaC2].equals("F") || tablero[FantasmaF3 + 1][FantasmaC3].equals("F") || tablero[FantasmaF1][FantasmaC1 + 1].equals("F") || tablero[FantasmaF2][FantasmaC2 + 1].equals("F") || tablero[FantasmaF3][FantasmaC3 + 1].equals("F") || tablero[FantasmaF1][FantasmaC1 - 1].equals("F") || tablero[FantasmaF2][FantasmaC2 - 1].equals("F") || tablero[FantasmaF3][FantasmaC3 - 1].equals("F")) {
        //}
        if (x < 0.25) {
            if (tablero[FantasmaF3 - 1][FantasmaC3].equals("F")) {

            } else {
                FantasmaF3--;
            }

        }
        if (x > 0.25 && x < 0.5) {
            if (tablero[FantasmaF3 + 1][FantasmaC3].equals("F")) {

            } else {
                FantasmaF3++;
            }

        }
        if (x > 0.5 && x < 0.75) {
            if (tablero[FantasmaF3][FantasmaC3 - 1].equals("F")) {

            } else {
                FantasmaC3--;
            }

        }
        if (x > 0.75 && x < 1) {
            if (tablero[FantasmaF3][FantasmaC3 + 1].equals("F")) {

            } else {
                FantasmaC3++;
            }

        }

    }
    // public static void Pastillas() {
    //   if (pacmanF)
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
    //Momiviento de pacman guiado por el jugador
    public static void moverPacman(String[][] tablero) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dime tu siguiente movimiento , usando WASD");
        char letra;
        letra = in.next().charAt(0);

        switch (letra) {

            case 'w':
                if (tablero[PacmanF - 1][PacmanC].equals("F")) {

                } else if (tablero[PacmanF - 1][PacmanC].equals("-")) {
                    PacmanF--;
                    tablero[PacmanF][PacmanC] = " ";
                    Puntuacion += 10;
                } else if (tablero[PacmanF - 1][PacmanC].equals("&")) {
                    PacmanF--;
                    tablero[PacmanF][PacmanC] = " ";
                    Puntuacion += 50;
                } else if (tablero[PacmanF][PacmanC].equals("☠ ")) {
                    System.out.println("Has perdido :(");
                    Muerte = true;
                } else {
                    PacmanF--;
                }
                //else {
                // PacmanF--;
                // }

                break;

            case 'a':
                if (tablero[PacmanF][PacmanC - 1].equals("F")) {

                } else if (tablero[PacmanF][PacmanC - 1].equals("-")) {
                    PacmanC--;
                    tablero[PacmanF][PacmanC] = " ";
                    Puntuacion += 10;
                } else if (tablero[PacmanF][PacmanC - 1].equals("&")) {
                    PacmanC--;
                    tablero[PacmanF][PacmanC] = " ";
                    Puntuacion += 50;
                } else if (tablero[PacmanF][PacmanC].equals("☠ ")) {
                    System.out.println("Has perdido :(");
                    Muerte = true;
                } else {
                    PacmanC--;
                }
                break;
            case 's':
                if (tablero[PacmanF + 1][PacmanC].equals("F")) {

                } else if (tablero[PacmanF + 1][PacmanC].equals("-")) {
                    PacmanF++;
                    tablero[PacmanF][PacmanC] = " ";
                    Puntuacion += 10;
                } else if (tablero[PacmanF + 1][PacmanC].equals("&")) {
                    PacmanF++;
                    tablero[PacmanF][PacmanC] = " ";
                    Puntuacion += 50;
                } else if (tablero[PacmanF][PacmanC].equals("☠ ")) {
                    System.out.println("Has perdido :(");
                    Muerte = true;
                } else {
                    PacmanF++;
                }

                break;
            case 'd':
                if (tablero[PacmanF][PacmanC + 1].equals("F")) {

                } else if (tablero[PacmanF][PacmanC + 1].equals("-")) {
                    PacmanC++;
                    tablero[PacmanF][PacmanC] = " ";
                    Puntuacion += 10;
                } else if (tablero[PacmanF][PacmanC + 1].equals("&")) {
                    PacmanC++;
                    tablero[PacmanF][PacmanC] = " ";
                    Puntuacion += 50;

                } else if (tablero[PacmanF][PacmanC].equals("☠ ")) {
                    System.out.println("Has perdido :(");
                    Muerte = true;
                } else {
                    PacmanC++;
                }

                break;
        }
        System.out.println("Your score is:" + Puntuacion);
    }

    //Imprime el tablero con los personajes y se actualiza
    public static void imprimirTablero(String[][] tablero) {
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

                        System.out.print("☠ ");
                    } else {
                        System.out.print("< ");

                    }
                } else if (i == FantasmaF1 && j == FantasmaC1) {
                    System.out.print("⍨ ");
                    //} else if (PacmanF == FantasmaF1 && PacmanC == FantasmaC1) {
                    //    System.out.print("୦ ");
                } else if (i == FantasmaF2 && j == FantasmaC2) {
                    System.out.print("⍨ ");
                    //} else if (PacmanF == FantasmaF2 && PacmanC == FantasmaC2) {
                    //    System.out.print("୦ ");
                } else if (i == FantasmaF3 && j == FantasmaC3) {
                    System.out.print("⍨ ");
                    //} else if (PacmanF == FantasmaF3 && PacmanC == FantasmaC3) {
                    //    System.out.print("୦ ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }

            }
            System.out.println("");
        }

    }

    // Función para creación de tableros
    public static String[][] dameTablero() {

        String[][] tablero = {
            {"F", "F", "F", "F", "F", "F", "F", "F", "F", "F"},
            {"F", "-", "-", "-", "-", "-", "-", "-", "-", "F"},
            {"F", "F", "-", "-", "-", "-", "-", "-", "F", "F"},
            {"F", "-", "-", "F", "&", "-", "F", "-", "-", "F"},
            {"F", "-", "-", "F", "-", "-", "F", "-", "-", "F"},
            {"F", "F", "-", "-", "-", "-", "-", "-", "F", "F"},
            {"F", "-", "-", "-", "-", "-", "-", "-", "&", "F"},
            {"F", "F", "F", "F", "F", "F", "F", "F", "F", "F"}
        };

        String[][] tablero2 = {
            {"F", "F", "F"},
            {"F", "-", "F"},
            {"F", "F", "F"}
        };

        return tablero;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Crear tablero, pacman y fantasmas
        String[][] tablero = dameTablero();

        // Rondas de la partida
        while (Puntuacion != 480 || Muerte == true) {
            // mostrar tablero
            imprimirTablero(tablero);

            // preguntar movimiento de pacman y movimiento
            moverPacman(tablero);
            //movimiento de los fantasmas
            FantasmaMovimiento1(tablero);
            FantasmaMovimiento2(tablero);
            FantasmaMovimiento3(tablero);

            // mensaje de ganar
            if (Puntuacion == 480) {
                System.out.println("Has ganado enhorabuena");
            }
        }

    }

}
