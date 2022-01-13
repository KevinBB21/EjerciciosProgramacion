/*
 * Proyecto EjerciciosProgramacion - Archivo Punto.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package EjerciciosPOO.Punto;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:01:16
 */
public class Punto {

    private int x,y;

    public Punto(int x , int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    
    public void imprime(){
        System.out.println("(" + getX() + ","+ getY() +")");
    }
    public void setXY(int x, int y){
        setX(x);
        setY(y);
    }
    
    public void desplaza(int dx, int dy){
        setX(x + dx);
        setY(y + dy);
        
    }
    public int distancia(Punto p){
        return (int) Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
    }
}
