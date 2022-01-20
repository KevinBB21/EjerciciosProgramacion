/*
 * Proyecto EjerciciosProgramacion - Archivo Persona.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package EjerciciosPOO.Persona;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:14:09
 */
public class Persona {

    final private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    static final int mayoriaedad = 18;
   

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        

    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(int edad) {
        this.edad = edad;
    }

    public void mayor(int e) {
        e = edad;
        if (e < 18) {
            System.out.println("Es menor de edad");
        } else {
            System.out.println("Es mayor de edad");
        }
    }

    public void imprime() {
        System.out.println(getDni() + ", " + getNombre() + ", " + getApellidos() + ", " + getEdad());
    }

    public boolean esMayorEdad() {
        if (getEdad() >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esJubilado() {
        if (getEdad() >= 65) {
            return true;
        } else {
            return false;
        }

    }
    public int diferenciaEdad(Persona p){
        return Math.abs(this.edad - p.edad);
    }
}
