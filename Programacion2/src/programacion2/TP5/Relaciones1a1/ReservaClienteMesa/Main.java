/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.ReservaClienteMesa;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Laura Jimenez", "555-1234");
        Mesa mesa = new Mesa(5, 4);
        
        // Se crea la reserva con la mesa, sin el cliente
        Reserva reserva = new Reserva("2025-09-20", "21:00", mesa);

        // Se asigna el cliente usando el setter, lo que es más flexible
        reserva.setCliente(cliente);

        System.out.println("Reserva para el cliente: " + reserva.getCliente().getNombre());
        System.out.println("Numero de mesa reservada: " + reserva.getMesa().getNumero());
    }
}
