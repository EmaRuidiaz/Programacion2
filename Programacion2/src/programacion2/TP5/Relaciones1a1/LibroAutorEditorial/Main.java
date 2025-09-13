/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.LibroAutorEditorial;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        // La editorial se crea de forma independiente
        Editorial editorial = new Editorial("Anagrama", "Calle de la Riera 5");

        // El libro se crea sin un autor al principio
        Libro libro = new Libro("Rayuela", "978-9500705252", editorial);

        // El autor se crea y se asigna al libro más tarde
        Autor autor = new Autor("Julio Cortazar", "Argentino");
        libro.setAutor(autor);

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());
    }
}
