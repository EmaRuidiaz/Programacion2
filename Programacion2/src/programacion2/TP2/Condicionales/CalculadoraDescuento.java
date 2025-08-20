/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP2.Condicionales;

import java.util.Scanner;

/**
 *
 * @author ema_r
 */
public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        char categoria = scanner.next().toUpperCase().charAt(0);

        double descuento = 0;
        double precioFinal = 0;
        
        switch (categoria) {
            case 'A':
                descuento = precio * 0.10;
                System.out.println("Descuento aplicado: 10%");
                break;
            case 'B':
                descuento = precio * 0.15;
                System.out.println("Descuento aplicado: 15%");
                break;
            case 'C':
                descuento = precio * 0.20;
                System.out.println("Descuento aplicado: 20%");
                break;
            default:
                System.out.println("Categoria invalida.");
                break;
        }
        
        precioFinal = precio - descuento;
        System.out.println("Precio final: " + precioFinal);
        scanner.close();
    }
}
