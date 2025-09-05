/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP3.RegistroEstudiante;

/**
 *
 * @author ema_r
 */
public class Main {
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Juan";
        estudiante1.apellido = "Perez";
        estudiante1.curso = "Programacion II";
        estudiante1.calificacion = 85;

        System.out.println("--- Informacion Inicial ---");
        estudiante1.mostrarInfo();

        System.out.println("\n--- Aumentando Calificacion ---");
        estudiante1.subirCalificacion(5);
        estudiante1.mostrarInfo();

        System.out.println("\n--- Disminuyendo Calificacion ---");
        estudiante1.bajarCalificacion(10);
        estudiante1.mostrarInfo();
    }
}
