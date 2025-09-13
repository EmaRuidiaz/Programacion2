/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Dependencias.DeUso.ImpuestoContribuyenteCalculadora;

/**
 *
 * @author ema_r
 */
public class Calculadora {
    
    public void calcular(Impuesto impuesto) { // Dependencia de uso
        System.out.println("Calculando impuesto con monto: " + impuesto.getMonto());
    }
}
