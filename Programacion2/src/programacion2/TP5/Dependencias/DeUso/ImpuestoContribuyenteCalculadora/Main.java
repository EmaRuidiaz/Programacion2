/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Dependencias.DeUso.ImpuestoContribuyenteCalculadora;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        // Se crea el contribuyente de forma independiente
        Contribuyente contribuyente = new Contribuyente("Juan", "20-12345678-9");

        // Se crea el impuesto sin un contribuyente al principio
        Impuesto iva = new Impuesto(100.50);

        // Se asigna el contribuyente al impuesto usando el setter
        iva.setContribuyente(contribuyente);

        Calculadora calculadora = new Calculadora();
        calculadora.calcular(iva);
    }
}
