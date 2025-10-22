/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP8.PuntoExcepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import programacion2.TP8.PuntoInterfaces.Clases.Cliente;
import programacion2.TP8.PuntoInterfaces.Clases.DePago.PayPal;
import programacion2.TP8.PuntoInterfaces.Clases.Pedido;
import programacion2.TP8.PuntoInterfaces.Clases.Producto;

/**
 *
 * @author ema_r
 */
public class Main {

    // Ejercicio 4: Validar Edad (Lanzamiento de Excepción Personalizada)
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad " + edad + " es invalida. Debe estar entre 0 y 120.");
        }
        System.out.println("Edad validada correctamente.");
    }
    
    // Ejercicio 1: División Segura
    public static void divisionSegura(Scanner scanner) {
        try {
            System.out.print("Introduce el numerador: ");
            int numerador = scanner.nextInt();
            System.out.print("Introduce el denominador: ");
            int denominador = scanner.nextInt();

            int resultado = numerador / denominador;
            System.out.println("Resultado de la division: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error (Division Segura): No se puede dividir por cero.");
        } catch (InputMismatchException e) {
             System.out.println("Error (Division Segura): Por favor, introduce solo numeros enteros.");
             scanner.nextLine();
        }
    }

    // Ejercicio 2: Conversión de cadena a número
    public static void conversionCadena(Scanner scanner) {
        try {
            System.out.print("Introduce una cadena para convertir a entero: ");
            String texto = scanner.next();
            
            int numero = Integer.parseInt(texto);
            System.out.println("Conversion exitosa: " + numero);
            
        } catch (NumberFormatException e) {
            System.out.println("Error (Conversion): La cadena introducida no es un numero entero valido.");
        }
    }
    
    // Ejercicio 3: Lectura de archivo (con IOException)
    // Nota: Aunque el ejercicio pide solo FileNotFoundException, el compilador obligará a manejar IOException
    public static void lecturaArchivo(String nombreArchivo) {
        try {
            // Se utiliza FileReader para forzar la FileNotFoundException
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
            
            System.out.println("Contenido de " + nombreArchivo + ":");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Error (Archivo): El archivo '" + nombreArchivo + "' no fue encontrado.");
        } catch (IOException e) {
            System.out.println("Error (Archivo): Ocurrio un error de I/O al leer el archivo.");
        }
    }
    
    // Ejercicio 5: Uso de try-with-resources
    public static void tryWithResourcesLectura(String nombreArchivo) {
        System.out.println("\nDemostracion de try-with-resources:");
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Contenido de " + nombreArchivo + " (via TWR):");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error (TWR): El archivo '" + nombreArchivo + "' no fue encontrado.");
        } catch (IOException e) {
            System.out.println("Error (TWR): Ocurrio un error de I/O: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // --- Ejecución Ejercicios de Excepciones ---
        System.out.println("--- PARTE 2: EXCEPCIONES ---");
        divisionSegura(scanner);
        conversionCadena(scanner);
        
        // Preparación para ejercicios de archivo
        String archivoExistente = "data.txt";
        String archivoNoExiste = "inexistente.txt";
        try {
            // Crear archivo temporal para pruebas
            PrintWriter writer = new PrintWriter(archivoExistente, "UTF-8");
            writer.println("Linea 1");
            writer.println("Linea 2");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        lecturaArchivo(archivoNoExiste);
        tryWithResourcesLectura(archivoExistente);
        
        // Ejecución Ejercicio 4
        System.out.println("\n Demostracion de Excepcion Personalizada:");
        try {
            validarEdad(35);
            validarEdad(-5);
        } catch (EdadInvalidaException e) {
            System.out.println("ERROR CAPTURADO: " + e.getMessage());
        }
        
        // --- Ejecución Ejemplo E-commerce (Parte 1) ---
        System.out.println("\n--- PARTE 1: INTERFACES (E-COMMERCE) ---");
        
        // 1. Crear Productos
        Producto lapiz = new Producto("Lapiz", 0.5);
        Producto teclado = new Producto("Teclado Mecanico", 85.0);
        
        // 2. Crear Cliente
        Cliente juan = new Cliente("Juan");
        
        // 3. Crear Pedido
        Pedido pedidoJuan = new Pedido(juan);
        pedidoJuan.agregarProducto(lapiz);
        pedidoJuan.agregarProducto(teclado);
        
        // Cálculo y Pago
        double totalPedido = pedidoJuan.calcularTotal();
        System.out.println("Total del pedido de Juan: $" + totalPedido);
        
        // 4. Pago con Descuento (PayPal)
        PayPal pagoPayPal = new PayPal();
        pagoPayPal.procesarPago(totalPedido);
        
        // 5. Notificación de Estado
        pedidoJuan.cambiarEstado("Enviado");

        scanner.close();
        
        // Limpiar archivo temporal
        new File(archivoExistente).delete();
    }
}
