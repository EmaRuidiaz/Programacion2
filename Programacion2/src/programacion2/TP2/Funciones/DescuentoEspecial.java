/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP2.Funciones;

import java.util.Scanner;

/**
 *
 * @author ema_r
 */
public class DescuentoEspecial {
    
    public static final double DESCUENTO_GLOBAL = 0.10;

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_GLOBAL;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        calcularDescuentoEspecial(precio);
        scanner.close();
    }
}
