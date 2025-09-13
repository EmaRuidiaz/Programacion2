/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.CuentaBancariaClaveSeguridadTitular;

/**
 *
 * @author ema_r
 */
public class CuentaBancaria {
    
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String claveCodigo, String claveModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        // Composición
        this.claveSeguridad = new ClaveSeguridad(claveCodigo, claveModificacion);
    }
    
    // Método setter para la relación bidireccional
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null) {
            titular.setCuenta(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public String getCbu() { return cbu; }
    public ClaveSeguridad getClaveSeguridad() { return claveSeguridad; }
}
