/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP8.PuntoInterfaces.Clases.DePago;

import programacion2.TP8.PuntoInterfaces.Interfaces.PagoConDescuento;

/**
 *
 * @author ema_r
 */
public class PayPal implements PagoConDescuento {
    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * 0.05;
        System.out.println("Aplicando 5% de descuento por PayPal: -$" + descuento);
        return monto - descuento;
    }

    @Override
    public void procesarPago(double monto) {
        double montoFinal = aplicarDescuento(monto);
        System.out.println("Procesando pago con PayPal por $" + montoFinal);
    }
}
