/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP7.AnimalesYComportamientoSobrescrito;

/**
 *
 * @author ema_r
 */
public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String describirAnimal() {
        return "Este es un animal generico: " + nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido desconocido.");
    }
}
