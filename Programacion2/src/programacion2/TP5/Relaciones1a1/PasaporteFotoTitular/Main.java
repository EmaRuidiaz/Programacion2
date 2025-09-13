/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.PasaporteFotoTitular;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        Titular titular = new Titular("Juan Perez", "12.345.678");
        Pasaporte pasaporte = new Pasaporte("P987654321", "2025-01-01", "foto_perfil.jpg", "JPEG");

        // Se establece la asociación después de la creación
        pasaporte.setTitular(titular);

        System.out.println("Titular del pasaporte: " + pasaporte.getTitular().getNombre());
        System.out.println("Número de Pasaporte del titular: " + titular.getPasaporte().getNumero());
    }
}
