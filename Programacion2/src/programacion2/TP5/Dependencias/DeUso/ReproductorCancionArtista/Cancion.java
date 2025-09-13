/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Dependencias.DeUso.ReproductorCancionArtista;

/**
 *
 * @author ema_r
 */
public class Cancion {
    
    private String titulo;
    private Artista artista;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    // Método setter para la asociación unidireccional con el artista
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    public String getTitulo() { return titulo; }
}
