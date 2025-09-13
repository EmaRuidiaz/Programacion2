/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.CuentaBancariaClaveSeguridadTitular;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        Titular titular = new Titular("Lucia Vazquez", "30.123.456");
        CuentaBancaria cuenta = new CuentaBancaria("00000001000000000001", 1500.50, "A1B2C3D4", "2025-08-01");

        // Se establece la asociación después de la creación
        cuenta.setTitular(titular);

        System.out.println("Cuenta de: " + cuenta.getTitular().getNombre());
        System.out.println("Codigo de seguridad: " + cuenta.getClaveSeguridad().getCodigo());
    }
}
