/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Dependencias.DeUso.ReproductorCancionArtista;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        // Se crea el artista de forma independiente
        Artista artista = new Artista("Coldplay", "Rock");
        
        // Se crea la canción sin un artista al principio
        Cancion cancion = new Cancion("Yellow");

        // Se asigna el artista a la canción usando el setter
        cancion.setArtista(artista);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
    }
}
