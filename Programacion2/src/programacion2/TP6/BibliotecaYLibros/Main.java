/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP6.BibliotecaYLibros;

/**
 *
 * @author ema_r
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("\n--- TAREA 1: CREACION DE LA BIBLIOTECA ---");
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Central UTN");

        System.out.println("\n--- TAREA 2: CREACION DE AUTORES ---");
        Autor a1 = new Autor("AUT004", "Carl Sagan", "Estadounidense"); 
        Autor a2 = new Autor("AUT005", "Stephen Hawking", "Britanico");
        Autor a3 = new Autor("AUT006", "Marie Curie", "Polaca/Francesa");
        
        System.out.println("\n--- TAREA 3: AGREGAR LIBROS ---");
        miBiblioteca.agregarLibro("978-11", "Cosmos: Un Viaje Personal", 1980, a1);
        miBiblioteca.agregarLibro("978-12", "Breve Historia del Tiempo", 1988, a2);
        miBiblioteca.agregarLibro("978-13", "Mecanica Cuantica y Campos", 1997, a2);
        miBiblioteca.agregarLibro("978-14", "Radiaciones y sus Efectos", 1903, a3);
        miBiblioteca.agregarLibro("978-15", "Contacto (Novela Ciencia)", 1985, a1);
        
        System.out.println("\n--- TAREA 4: LISTAR LIBROS---");
        miBiblioteca.listarLibros();
        
        System.out.println("\n--- TAREA 5: BUSQUEDA POR ISBN (978-12) ---");
        Libro libroBuscado = miBiblioteca.buscarLibroPorIsbn("978-12");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }
        
        System.out.println("\n--- TAREA 6: FILTRAR Y MOSTRAR POR ANIO---");
        miBiblioteca.filtrarLibrosPorAnio(1985);
        
        System.out.println("\n--- TAREA 7: ELIMINAR LIBRO (978-14) Y LISTAR RESTANTES ---");
        miBiblioteca.eliminarLibro("978-14");
        miBiblioteca.listarLibros();
        
        System.out.println("\n--- TAREA 8: CANTIDAD TOTAL DE LIBROS ---");
        System.out.println("La biblioteca tiene un total de " + miBiblioteca.obtenerCantidadLibros() + " libros.");
        
        System.out.println("\n--- TAREA 9: LISTADO DE AUTORES DISPONIBLES ---");
        miBiblioteca.mostrarAutoresDisponibles();
    }
}
