/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.ReservaClienteMesa;

/**
 *
 * @author ema_r
 */
public class Reserva {
    
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        // Agregación: la mesa se pasa al constructor
        this.mesa = mesa;
    }

    // Método setter para la asociación unidireccional con el cliente
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFecha() { return fecha; }
    public Cliente getCliente() { return cliente; }
    public Mesa getMesa() { return mesa; }
}
