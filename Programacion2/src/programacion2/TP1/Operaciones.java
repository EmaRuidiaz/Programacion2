/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP1;

import java.util.Scanner;

/**
 *
 * @author ema_r
 */
public class Operaciones {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in) ;
        System.out.println("Ingrese el primer numero entero: ") ;
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        if (num2 != 0) {
            double division = (double) num1 / num2;
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: Error (division por cero)");
        }
        System.out.println("Suma: " + suma) ;
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
    }
    
}
