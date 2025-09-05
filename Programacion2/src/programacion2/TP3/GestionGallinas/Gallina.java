/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP3.GestionGallinas;

/**
 *
 * @author ema_r
 */
public class Gallina {
    
    // Atributos
    int idGallina;
    int edad;
    int huevosPuestos;

    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0; 
    }

    // Métodos
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " ha puesto un huevo. Total de huevos: " + huevosPuestos);
    }

    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " ha envejecido. Ahora tiene " + edad + " anios.");
    }

    public void mostrarEstado() {
        System.out.println("Estado de Gallina " + idGallina + ":");
        System.out.println("  - Edad: " + edad + " anios");
        System.out.println("  - Huevos Puestos: " + huevosPuestos);
    }
}
