/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP6.BibliotecaYLibros;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ema_r
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>(); 
        System.out.println("Biblioteca creada: " + nombre);
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (buscarLibroPorIsbn(isbn) == null) {
            Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
            libros.add(nuevoLibro);
            System.out.println("Libro agregado: '" + titulo + "'");
        } else {
            System.out.println("Error: Ya existe un libro con el ISBN: " + isbn);
        }
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("\nLa biblioteca esta vacia.");
            return;
        }
        System.out.println("\n--- LISTADO DE LIBROS EN LA BIBLIOTECA (" + nombre + ") ---");
        for (Libro libro : libros) {
            System.out.println("Titulo: " + libro.getTitulo() + 
                               " | ISBN: " + libro.getIsbn() + 
                               " | Anio: " + libro.getAnioPublicacion() + 
                               " | Autor: " + libro.getAutor().toString());
        }
        System.out.println("---------------------------------------------------------");
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        if (libroAEliminar != null) {
            libros.remove(libroAEliminar);
            System.out.println("Libro eliminado: " + libroAEliminar.getTitulo());
            return true;
        }
        System.out.println("Error al eliminar: Libro con ISBN " + isbn + " no encontrado.");
        return false;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n--- LIBROS PUBLICADOS EN EL ANIO: " + anio + " ---");
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                System.out.println("Titulo: " + libro.getTitulo() + " | Autor: " + libro.getAutor().getNombre());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros publicados en el anio " + anio + ".");
        }
        System.out.println("---------------------------------------------------");
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("\n--- AUTORES DISPONIBLES EN LA BIBLIOTECA ---");
        List<String> idsAutores = new ArrayList<>();
        
        for (Libro libro : libros) {
            String autorId = libro.getAutor().getId();
            
            if (!idsAutores.contains(autorId)) {
                idsAutores.add(autorId);
                libro.getAutor().mostrarInfo();
            }
        }
        System.out.println("----------------------------------------------");
    }
}
