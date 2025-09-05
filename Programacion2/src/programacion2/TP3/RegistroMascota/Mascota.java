/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP3.RegistroMascota;

/**
 *
 * @author ema_r
 */
public class Mascota {
    
    // Atributos
    String nombre;
    String especie;
    int edad;

    // Métodos
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " anios");
    }

    public void cumplirAnios() {
        edad++;
        System.out.println("Feliz cumpleanios, " + nombre + "! Ahora tiene " + edad + " anios.");
    }
    
}
