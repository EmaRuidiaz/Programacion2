/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP3.GestionGallinas;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        
        Gallina gallina1 = new Gallina(1, 1);
        Gallina gallina2 = new Gallina(2, 2);

        System.out.println("--- Estados Iniciales ---");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

        System.out.println("\n--- Simulando acciones ---");
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.envejecer();

        gallina2.envejecer();
        gallina2.ponerHuevo();

        System.out.println("\n--- Estados Finales ---");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}
