/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.CelularBateriaUsuario;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        Bateria bateria = new Bateria("Li-Ion 3500", 3500);
        Celular celular = new Celular("1234567890", "Samsung", "S21", bateria);
        Usuario usuario = new Usuario("Ana Gomez", "87.654.321");
        celular.setUsuario(usuario);

        System.out.println("Celular: " + celular.getMarca() + " " + celular.getModelo());
        System.out.println("Modelo de Bateria: " + celular.getBateria().getModelo());
        System.out.println("Duenio del celular: " + celular.getUsuario().getNombre());
    }
}
