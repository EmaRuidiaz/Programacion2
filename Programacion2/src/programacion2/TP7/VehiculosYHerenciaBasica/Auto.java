/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP7.VehiculosYHerenciaBasica;

/**
 *
 * @author ema_r
 */
public class Auto extends Vehiculo{
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); 
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Es un Auto con " + cantidadPuertas + " puertas.");
    }
}
