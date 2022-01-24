/*
 * Proyecto EjerciciosProgramacion - Archivo Dniarray.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ArraysPOO;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 24 ene. 2022 19:17:39
 */
public class Dni {

    // ATRIBUTOS
    private int dni;
    private static final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

    // CONSTRUCTOR
    public Dni(int dni) {
        this.dni = dni;
    }

    // GETTERS
    public int getDNI() {
        return this.dni;
    }

    public char getLetra() {
        return letras.charAt(dni % 23);
    }

    public String getNIF() {
        return ("" + dni + getLetra());
    }

    // SETTERS
    public void setDNI(int dni) {
        this.dni = dni;
    }

    // OTROS MÉTODOS
    public void imprime() {
        System.out.println(getDNI() + "" + getLetra());
    }

    public static Dni newRandomDNI() {

        Dni nm = new Dni((int) (Math.random() * 99999999 - 11111111 + 1) + 11111111);

        return nm;

    }
}