/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP7.AnimalesYComportamientoSobrescrito;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ema_r
 */
public class Main {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Fido"));
        animales.add(new Gato("Michi"));
        animales.add(new Vaca("Lola"));

        for (Animal animal : animales) {
            animal.hacerSonido(); 
        }
    }
}
