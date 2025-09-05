/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP3.EncapsulamientoLibro;

/**
 *
 * @author ema_r
 */
public class Libro {
    
    // Atributos privados
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    // Setter con validación
    public void setAñoPublicacion(int año) {
        if (año > 0 && año <= 2025) { 
            this.añoPublicacion = año;
            System.out.println("Anio de publicacion actualizado a: " + año);
        } else {
            System.out.println("Error: Valor de anio invalido. El anio no fue modificado.");
        }
    }
    
}
