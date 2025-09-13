/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.DocumentoFirmaDigitalUsuario;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Sofia", "sofia@example.com");
        Documento doc = new Documento("Informe Anual", "Contenido del informe...", "abc123def456", "2025-09-13", usuario);

        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Firmado por: " + doc.getFirmaDigital().getUsuario().getNombre());
    }
}
