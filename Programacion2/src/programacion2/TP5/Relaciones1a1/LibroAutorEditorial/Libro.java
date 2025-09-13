/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.LibroAutorEditorial;

/**
 *
 * @author ema_r
 */
public class Libro {
    
    private String titulo;
    private String isbn;
    private Autor autor; // Asociación unidireccional
    private Editorial editorial; // Agregación

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    // Método setter para la asociación unidireccional
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() { return titulo; }
    public Autor getAutor() { return autor; }
    public Editorial getEditorial() { return editorial; }
}
