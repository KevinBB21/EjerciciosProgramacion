/*
 * Proyecto EjerciciosProgramacion - Archivo Contacto.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package CPagendaArraysPOO;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 24 ene. 2022 21:11:05
 */
public class Contacto {

    
    private String nombre;
    private String telefono;
    private String correo;
    
    public Contacto(String nombre, String telefono, String correo){
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public String getCorreo(){
        return this.correo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public void imprime(){
        System.out.println(getAll());
    }
    
    public String getAll(){
        
        return getNombre()+ " " + getTelefono() + " " + getCorreo();
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
