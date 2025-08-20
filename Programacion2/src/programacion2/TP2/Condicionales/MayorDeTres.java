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
public class MayorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int num3 = scanner.nextInt();

        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El mayor es: " + mayor);
        scanner.close();
    }
}
