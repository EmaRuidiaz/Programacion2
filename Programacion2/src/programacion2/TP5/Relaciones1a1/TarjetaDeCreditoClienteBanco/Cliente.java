/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.TarjetaDeCreditoClienteBanco;

/**
 *
 * @author ema_r
 */
public class Cliente {
    
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) { this.tarjeta = tarjeta; }
    public TarjetaDeCredito getTarjeta() { return tarjeta; }
    public String getNombre() { return nombre; }
}
