/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP6.UniversidadProfesorYCurso;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ema_r
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public List<Curso> getCursos() { return cursos; }
    
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                 c.setProfesor(this);
            }
        }
    }
    
    public void eliminarCurso(Curso c) {
        if (cursos.remove(c)) {
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    public void listarCursos() {
        System.out.println("Cursos dictados por " + nombre + ":");
        if (cursos.isEmpty()) {
            System.out.println("  - Actualmente no dicta cursos.");
            return;
        }
        for (Curso c : cursos) {
            System.out.println("  - [" + c.getCodigo() + "] " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + 
                           " | Especialidad: " + especialidad + 
                           " | Cursos: " + cursos.size());
    }
}
