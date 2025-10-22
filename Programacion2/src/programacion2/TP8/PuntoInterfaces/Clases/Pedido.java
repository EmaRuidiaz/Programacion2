/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP8.PuntoInterfaces.Clases;

import java.util.ArrayList;
import java.util.List;
import programacion2.TP8.PuntoInterfaces.Interfaces.Notificable;
import programacion2.TP8.PuntoInterfaces.Interfaces.Pagable;

/**
 *
 * @author ema_r
 */
public class Pedido implements Pagable {
    private List<Producto> productos = new ArrayList<>();
    private String estado = "Pendiente";
    private Notificable cliente;

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El estado de su pedido ha cambiado a: " + nuevoEstado); 
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
}
