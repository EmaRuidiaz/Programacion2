/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Dependencias.DeUso.ReproductorCancionArtista;

/**
 *
 * @author ema_r
 */
public class Reproductor {
    
    public void reproducir(Cancion cancion) { // Dependencia de uso
        System.out.println("Reproduciendo: " + cancion.getTitulo());
    }
}
