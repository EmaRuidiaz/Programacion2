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
public class ConversionesInt {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Ingrese el primer numero entero: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo numero entero: ");
        int num2 = scanner.nextInt();
        
        if (num2 != 0){
            int resultado = num1 / num2;
            System.out.println("Resultado (int): " + resultado);
        } else {
            System.out.println("Error: division por cero");
        }
    }   
}
