/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP3.EncapsulamientoLibro;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("El Senior de los Anillos", "J.R.R. Tolkien", 1954);

        System.out.println("--- Informacion Inicial ---");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Anio de Publicacion: " + libro1.getAñoPublicacion());

        System.out.println("\n--- Intentando modificar anio con valor invalido ---");
        libro1.setAñoPublicacion(-100);

        System.out.println("\n--- Modificando anio con valor valido ---");
        libro1.setAñoPublicacion(1965);

        System.out.println("\n--- Informacion Final ---");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Anio de Publicacion: " + libro1.getAñoPublicacion());
    }
}
