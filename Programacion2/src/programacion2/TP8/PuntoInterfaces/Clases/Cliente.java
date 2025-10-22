/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP8.PuntoInterfaces.Clases;

import programacion2.TP8.PuntoInterfaces.Interfaces.Notificable;

/**
 *
 * @author ema_r
 */
public class Cliente implements Notificable {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificacion a " + nombre + ": " + mensaje);
    }
}
