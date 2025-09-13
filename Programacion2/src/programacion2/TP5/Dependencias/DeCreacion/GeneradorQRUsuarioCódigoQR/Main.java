/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Dependencias.DeCreacion.GeneradorQRUsuarioCódigoQR;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        // Se crea el usuario de forma independiente
        Usuario usuario = new Usuario("Fernando", "fernando@example.com");
        
        // Se crea el generador
        GeneradorQR generador = new GeneradorQR();
        
        // Se genera el código QR
        CodigoQR qrCode = generador.generar("www.google.com", usuario);

        System.out.println("Codigo QR creado con el valor: " + qrCode.getValor());
    }
}
