/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP7.AnimalesYComportamientoSobrescrito;

/**
 *
 * @author ema_r
 */
public class Gato extends Animal{
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(super.describirAnimal() + " y dice: Miau!");
    }
}
