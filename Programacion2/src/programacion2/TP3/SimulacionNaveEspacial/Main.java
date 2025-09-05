/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP3.SimulacionNaveEspacial;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        
        NaveEspacial nave1 = new NaveEspacial("Odisea", 50);

        System.out.println("--- Estado Inicial ---");
        nave1.mostrarEstado();

        System.out.println("\n--- Intentando avanzar sin recargar ---");
        nave1.avanzar(200);

        System.out.println("\n--- Recargando y avanzando ---");
        nave1.recargarCombustible(30);
        nave1.avanzar(200);

        System.out.println("\n--- Estado Final ---");
        nave1.mostrarEstado();
    }
}
