/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP8.PuntoInterfaces.Clases.DePago;

import programacion2.TP8.PuntoInterfaces.Interfaces.Pago;

/**
 *
 * @author ema_r
 */
public class TarjetaCredito implements Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("💳 Procesando pago con Tarjeta de Crédito por $" + monto);
    }
}
