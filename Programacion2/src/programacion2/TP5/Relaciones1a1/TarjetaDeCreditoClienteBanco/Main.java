/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.TarjetaDeCreditoClienteBanco;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Marta Rodriguez", "23.456.789");
        Banco banco = new Banco("Banco Central", "30-12345678-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4567-8901-2345-6789", "12/28", banco, cliente);

        System.out.println("Numero de Tarjeta: " + cliente.getTarjeta().getNumero());
        System.out.println("Banco de la tarjeta: " + tarjeta.getBanco().getNombre());
    }
}
