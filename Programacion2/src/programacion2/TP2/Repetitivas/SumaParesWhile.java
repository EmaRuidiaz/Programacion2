/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP2.Repetitivas;

import java.util.Scanner;

/**
 *
 * @author ema_r
 */
public class SumaParesWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int sumaPares = 0;

        System.out.println("Ingrese numeros (0 para terminar):");
        do {
            System.out.print("Ingrese un numero: ");
            numero = scanner.nextInt();
            if (numero % 2 == 0) {
                sumaPares += numero;
            }
        } while (numero != 0);

        System.out.println("La suma de los numeros pares es: " + sumaPares);
        scanner.close();
    }
}
