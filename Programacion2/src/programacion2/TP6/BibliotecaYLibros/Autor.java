/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP6.BibliotecaYLibros;

/**
 *
 * @author ema_r
 */
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    
    public void mostrarInfo() {
        System.out.println("  ID Autor: " + id);
        System.out.println("  Nombre: " + nombre);
        System.out.println("  Nacionalidad: " + nacionalidad);
    }
    
    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }
}
