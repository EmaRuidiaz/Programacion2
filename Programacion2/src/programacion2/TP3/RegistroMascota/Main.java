/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP3.RegistroMascota;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Firulais";
        mascota1.especie = "Perro";
        mascota1.edad = 3;

        System.out.println("--- Informacion Inicial ---");
        mascota1.mostrarInfo();

        System.out.println("\n--- Pasando el Tiempo ---");
        mascota1.cumplirAnios();

        System.out.println("\n--- Informacion Actualizada ---");
        mascota1.mostrarInfo();
    }
    
}
