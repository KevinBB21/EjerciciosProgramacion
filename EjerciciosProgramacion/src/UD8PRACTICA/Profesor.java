/*
 * Proyecto EjerciciosProgramacion - Archivo Profesore.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD8PRACTICA;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 24 feb. 2022 20:26:28
 */
public class Profesor extends Persona {

    private double sal;
    private String espec;

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getEspec() {
        return espec;
    }

    public void setEspec(String espec) {
        this.espec = espec;
    }

    public Profesor(String n, String a, String f, double sal, String espec) {
        super(n, a, f);
        System.out.println(sal + " " + espec);
    }

}
