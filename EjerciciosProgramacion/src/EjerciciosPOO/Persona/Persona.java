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

    public String dni;
    public String nombre; 
    public String apellidos;
    public int edad;
   
    
    public void mayor (int e){
       e = edad;
        if (e < 18) {
            System.out.println("Es menor de edad");
        }
        else{
            System.out.println("ES mayor de edad");
        }
   }
    
}

   

 
