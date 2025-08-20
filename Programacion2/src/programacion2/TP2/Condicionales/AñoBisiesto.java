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
public class AñoBisiesto {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un anio: ");
        int anio = scanner.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El anio " + anio + " es bisiesto.");
        } else {
            System.out.println("El anio " + anio + " no es bisiesto.");
        }
        scanner.close();
    }
}
