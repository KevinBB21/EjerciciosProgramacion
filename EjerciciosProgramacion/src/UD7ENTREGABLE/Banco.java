/*
 * Proyecto EjerciciosProgramacionJava - Archivo Banco.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD7ENTREGABLE;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 27 ene. 2022 20:15:58
 */
public class Banco {

    private Cuenta[] cuentas;
    private int nCuentas;
    private int MAX = 100;
    private int nCuentasAux = 0;
    private int[] pos = new int[MAX];

    public Banco() {

        cuentas = new Cuenta[MAX];
        nCuentas = 0;
    }

    // GETTERS
    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public int getnCuentas() {
        return nCuentas;
    }

    // MÉTODOS
    public void agregarCuenta(Cuenta cuenta) throws CuentaException {

        try {
            cuentas[nCuentas] = cuenta;
            nCuentas++;
            for (int i = 0; i < nCuentas; i++) {
                if (cuentas[i].getTitular().equalsIgnoreCase(cuenta.getTitular())) {

                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());

        } 
    }

    public void eliminarCuenta(int posicion) throws CuentaException {

        try {
            for (int i = posicion + 1; i < nCuentas; i++) {
                cuentas[i - 1] = cuentas[i];
            }
            nCuentas--;
        } catch (IndexOutOfBoundsException d) {
            System.err.println("Esa cuenta es mayor al maximo o negativa");
        }catch (NullPointerException x) {
            System.err.println("Posicion no existente");
        }

    }

    public void ingresarDinero(double cantidad, int posicion) throws CuentaException {
        try {
            cuentas[posicion].ingresarDinero(cantidad);
        } catch (CuentaException i) {
            System.err.println(i.getMessage());
        } catch (IndexOutOfBoundsException y) {
            System.err.println("Posicion no encontrada el numero dado esta fuera de rango");
        }catch (NullPointerException x) {
            System.err.println("Posicion no existente");
        }

    }

    public void retirarDinero(double cantidad, int posicion) throws CuentaException {
        try {
            cuentas[posicion].retirarDinero(cantidad);
        } catch (CuentaException i) {
            System.err.println(i.getMessage());
        } catch (IndexOutOfBoundsException y) {
            System.err.println("Esa posicion no es logica sera mayor a la maxima o negativa");
        }catch (NullPointerException x) {
            System.err.println("Posicion no existente");
        }
    }

    public void transferenciaCantidad(int posOrigen, int posDestino, double cantidad) throws CuentaException {
        try {
            try {
                cuentas[posDestino].ingresarDinero(cantidad);
            } catch (CuentaException u) {
                System.err.println(u.getMessage());
            } catch (IndexOutOfBoundsException y) {
                System.err.println("Error con la posicion dada");
            }catch (NullPointerException x) {
            System.err.println("Esa posicion no es logica sera mayor a la maxima o negativa");
        }
            cuentas[posOrigen].retirarDinero(cantidad);
        } catch (CuentaException e) {
            System.err.println(e.getMessage());
        } catch (IndexOutOfBoundsException r){
            System.err.println("Error con la posicion dada");
        }catch (NullPointerException x) {
            System.err.println("Posicion no existente");
        }

    }

    public int[] buscarCuenta(String nombre) throws CuentaException {

        nCuentasAux = 0;

        for (int i = 0; i < nCuentas; i++) {

            if (cuentas[i].getTitular().toUpperCase().indexOf(nombre.toUpperCase()) >= 0) {
                pos[nCuentasAux] = i;
                nCuentasAux++;
            }
        }
        if (nCuentasAux == 0) {
            System.err.println("No se han encontrado coincidencias o has puesto algun dato erroneo");
        }
        return pos;
    }

    public void mostrarCuenta(int[] pos) {
        for (int i = 0; i < nCuentasAux; i++) {
            cuentas[pos[i]].imprimir();
        }
    }

    public void imprimirTodos() {
        if (nCuentas == 0) {
            System.err.println("ERROR. No existen cuentas");
        } else {
            for (int i = 0; i < nCuentas; i++) {
                System.out.print(i + ". ");
                cuentas[i].imprimir();
            }
        }
    }

    public void mostrarMorosos() {
        for (int i = 0; i < nCuentas; i++) {
            if (cuentas[i].getSaldo() < 0) {
                System.out.print(i + ". ");
                cuentas[i].imprimir();
            }
        }
    }
}
