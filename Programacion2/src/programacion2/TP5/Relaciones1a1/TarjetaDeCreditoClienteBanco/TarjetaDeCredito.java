/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.TarjetaDeCreditoClienteBanco;

/**
 *
 * @author ema_r
 */
public class TarjetaDeCredito {
    
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
        this.cliente = cliente;
        if (cliente != null) {
            cliente.setTarjeta(this);
        }
    }

    public Banco getBanco() { return banco; }
    public String getNumero() { return numero; }
    public Cliente getCliente() { return cliente; }
}
