/*
 * Proyecto EjerciciosProgramacion - Archivo Alumno.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD8PRACTICA;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 24 feb. 2022 20:28:38
 */
public class Alumno extends Persona {

    private String grup;
    private double ntmedia;

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public double getNtmedia() {
        return ntmedia;
    }

    public void setNtmedia(double ntmedia) {
        this.ntmedia = ntmedia;
    }
    
    public Alumno(String n, String a, String f , String grup , double ntmedia) {
        super(n, a, f);
        System.out.println(grup + " " + ntmedia);
    }

}
