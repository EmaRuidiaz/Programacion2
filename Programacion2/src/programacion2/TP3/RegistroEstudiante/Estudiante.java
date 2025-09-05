/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP3.RegistroEstudiante;

/**
 *
 * @author ema_r
 */
public class Estudiante {
    
    // Atributos
    String nombre;
    String apellido;
    String curso;
    int calificacion;

    // Métodos
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }

    public void subirCalificacion(int puntos) {
        calificacion += puntos;
        System.out.println(nombre + " ha subido su calificacion " + puntos + " puntos.");
    }

    public void bajarCalificacion(int puntos) {
        calificacion -= puntos;
        System.out.println(nombre + " ha bajado su calificacion " + puntos + " puntos.");
    }
}
