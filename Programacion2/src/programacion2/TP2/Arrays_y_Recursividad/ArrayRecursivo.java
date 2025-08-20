/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP2.Arrays_y_Recursividad;

/**
 *
 * @author ema_r
 */
public class ArrayRecursivo {
    
    public static void imprimirArrayRecursivo(double[] array, int indice) {
        if (indice < array.length) {
            System.out.println("Precio: $" + array[indice]);
            imprimirArrayRecursivo(array, indice + 1);
        }
    }

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0);

        // Modificar el tercer producto (índice 2)
        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        imprimirArrayRecursivo(precios, 0);
    }
}
