/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP6.UniversidadProfesorYCurso;

/**
 *
 * @author ema_r
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor p) {
        if (this.profesor != null && this.profesor != p) {
            this.profesor.getCursos().remove(this); 
        }
        this.profesor = p;
        if (p != null) {
            if (!p.getCursos().contains(this)) {
                p.getCursos().add(this);
            }
        }
    }

    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.println("Codigo: " + codigo + " | Nombre: " + nombre + 
                           " | Profesor: " + nombreProfesor);
    }
}
