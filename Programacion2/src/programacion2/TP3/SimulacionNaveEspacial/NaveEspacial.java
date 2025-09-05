/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP3.SimulacionNaveEspacial;

/**
 *
 * @author ema_r
 */
public class NaveEspacial {
    
    // Atributos
    String nombre;
    int combustible;
    final int COMBUSTIBLE_MAXIMO = 100;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = combustibleInicial;
    }

    // Métodos
    public void despegar() {
        System.out.println(nombre + " ha despegado. ¡Estamos en el espacio!");
    }

    public void avanzar(int distancia) {
        int combustibleRequerido = distancia / 10;
        if (combustible >= combustibleRequerido) {
            combustible -= combustibleRequerido;
            System.out.println(nombre + " ha avanzado " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("Alerta: Combustible insuficiente para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if ((combustible + cantidad) <= COMBUSTIBLE_MAXIMO) {
            combustible += cantidad;
            System.out.println(nombre + " ha recargado " + cantidad + " unidades. Combustible actual: " + combustible);
        } else {
            System.out.println("Error: No se puede recargar. Se superaría el límite de combustible.");
        }
    }

    public void mostrarEstado() {
        System.out.println("--- Estado de la Nave " + nombre + " ---");
        System.out.println("Combustible: " + combustible + " unidades");
    }
}
