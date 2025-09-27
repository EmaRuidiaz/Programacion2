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
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        System.out.println("Universidad " + nombre + " creada.");
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        }
        return null;
    }
    
    public void agregarProfesor(Profesor p) { profesores.add(p); }
    public void agregarCurso(Curso c) { cursos.add(c); }
    
    public void listarProfesores() {
        System.out.println("\n--- LISTADO DE PROFESORES ---");
        profesores.forEach(Profesor::mostrarInfo);
    }
    
    public void listarCursos() {
        System.out.println("\n--- LISTADO DE CURSOS ---");
        cursos.forEach(Curso::mostrarInfo);
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println("Error: Curso con codigo " + codigoCurso + " no encontrado.");
            return;
        }
        if (profesor == null) {
            System.out.println("Error: Profesor con ID " + idProfesor + " no encontrado.");
            return;
        }
        
        curso.setProfesor(profesor);
        System.out.println("Asignacion exitosa: " + profesor.getNombre() + " -> " + curso.getNombre());
    }

    public boolean eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            if (curso.getProfesor() != null) {
                curso.setProfesor(null); 
            }
            cursos.remove(curso);
            System.out.println("Curso eliminado: " + curso.getNombre());
            return true;
        }
        System.out.println("Error al eliminar: Curso no encontrado.");
        return false;
    }

    public boolean eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            while (!profesor.getCursos().isEmpty()) {
                Curso curso = profesor.getCursos().get(0);
                curso.setProfesor(null);
            }
            
            profesores.remove(profesor);
            System.out.println("Profesor eliminado: " + profesor.getNombre());
            return true;
        }
        System.out.println("Error al eliminar: Profesor no encontrado.");
        return false;
    }
    
    public void reporteCursosPorProfesor() {
        System.out.println("\n--- REPORTE: Cantidad de Cursos por Profesor ---");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " cursos.");
        }
    }
}
