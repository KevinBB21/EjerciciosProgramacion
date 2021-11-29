/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class EjericiosProgramacion {

    public static int muestraMenu() {
        Scanner in = new Scanner(System.in);
        int opcion;
        System.out.println("1. Suma (A + B)\n"
                + "2. Resta (A - B)\n"
                + "3. Multiplicación (A * B)\n"
                + "4. División (A / B)\n"
                + "5. Área de un rectángulo (Base x Altura)\n"
                + "6. Área de un triángulo equilátero (Base x Altura / 2)\n"
                + "7. Área de un círculo (Pi x R²)\n"
                + "8. Seno, Coseno y Tangente (de X)\n"
                + "9. Salir");

        opcion = PedirNumero(1, 9);
        return opcion;

    }

    public static int PedirNumero(int min, int max) {
        Scanner in = new Scanner(System.in);
        int valor;
        do {
            System.out.println("Introduce un valor entre " + min + " y " + max);
            valor = in.nextInt();
            if (valor < min || valor > max) {
                System.out.println("ERROR, número fuera de rango");
            }
        } while (valor < min || valor > max);
        return valor;

    }

    public static void realizaOperacion(int opcion) {
        switch (opcion) {
            case 1:
                SumaNumero();
                break;

            case 2:
                RestaNumero();
                break;
            case 3:
                MultNumero();
                break;

            case 4:
                DivNumero();
                break;

            case 5:
                AreaRect();
                break;

            case 6:
                AreaTriang();
                break;
            case 7:
                AreaCirculo();
                break;
            case 8:
                CalculaSinCosTan();
                break;
            case 9:
                System.out.println("Hasta luego!");

        }

    }

    public static void SumaNumero() {
        Scanner in = new Scanner(System.in);
        System.out.println("Primer numero");
        int a = in.nextInt();
        System.out.println("Segundo numero");
        int b = in.nextInt();
        int suma = a + b;
        System.out.println(suma);
        //return suma;

    }

    public static void RestaNumero() {
        Scanner in = new Scanner(System.in);
        System.out.println("Primer numero");
        int a = in.nextInt();
        System.out.println("Segundo numero");
        int b = in.nextInt();
        int resta = a - b;
        System.out.println(resta);
        //return resta
    }

    public static void MultNumero() {
        Scanner in = new Scanner(System.in);
        System.out.println("Primer numero");
        int a = in.nextInt();
        System.out.println("Segundo numero");
        int b = in.nextInt();
        int multi = a * b;
        System.out.println(multi);
        //return multi
    }

    public static void DivNumero() {
        Scanner in = new Scanner(System.in);
        System.out.println("Primer numero");
        int a = in.nextInt();
        System.out.println("Segundo numero");
        int b = in.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println("ERROR");
        } else {
            int division = a / b;
            System.out.println(division);
            //return division
        }
    }

    public static void AreaRect() {
        int base = PedirNumero(0,1000000);
        int altura = PedirNumero(0,1000000);
        int area = base * altura;
        System.out.println(area);
        //return area?
    }

    public static void AreaTriang() {
        int base = PedirNumero(0,1000000);
        int altura = PedirNumero(0,1000000);
        int area = (base * altura) / 2;
        System.out.println(area);
        //return area?
    }

    public static void AreaCirculo() {
        double a = PedirNumero(0,1000000);
        double area = ((a * a) * 3.14);
        System.out.println(area);
    }

    public static void CalculaSinCosTan() {
        double x = PedirNumero(-360, 360);
        System.out.println(Math.sin(x)+": Seno");
        System.out.println(Math.cos(x)+": Coseno");
        System.out.println(Math.tan(x)+": Tangente");
    }

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = muestraMenu();
            realizaOperacion(opcion);
            System.out.println("");
        } while (opcion != 9);
    }

}
