/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP8.PuntoInterfaces.Clases;

import programacion2.TP8.PuntoInterfaces.Interfaces.Pagable;

/**
 *
 * @author ema_r
 */
public class Producto implements Pagable {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public double calcularTotal() {
        return this.precio;
    }

    @Override
    public String toString() {
        return nombre + " ($" + precio + ")";
    }
}
