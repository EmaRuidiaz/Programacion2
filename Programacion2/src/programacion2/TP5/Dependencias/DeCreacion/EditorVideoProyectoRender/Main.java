/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Dependencias.DeCreacion.EditorVideoProyectoRender;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        // Se crea el proyecto de forma independiente
        Proyecto proyecto = new Proyecto("Vacaciones en la playa", 15);
        
        // Se crea el editor de video
        EditorVideo editor = new EditorVideo();
        
        // Se exporta el video
        Render renderFinal = editor.exportar("MP4", proyecto);

        System.out.println("Formato del render final: " + renderFinal.getFormato());
    }
}
