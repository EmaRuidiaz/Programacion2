/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.ComputadoraPlacaMadrePropietario;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        Computadora pc = new Computadora("HP", "X12345", "Asus", "Intel Z590");
        Propietario propietario = new Propietario("Carlos Lopez", "34.567.890");

        // Se establece la asociación después
        pc.setPropietario(propietario);

        System.out.println("PC marca: " + propietario.getComputadora().getMarca());
        System.out.println("Modelo de la placa madre: " + pc.getPlacaMadre().getModelo());
    }
}
