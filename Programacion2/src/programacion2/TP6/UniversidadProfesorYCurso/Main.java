/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP6.UniversidadProfesorYCurso;

/**
 *
 * @author ema_r
 */
public class Main {
    public static void main(String[] args) {
        
        Universidad utn = new Universidad("UTN - Programacion II");
        
        System.out.println("\n--- TAREAS 1: CREAR PROFESORES Y CURSOS ---");
        Profesor pA = new Profesor("P01", "Dr. Lopez", "Estructuras de Datos");
        Profesor pB = new Profesor("P02", "Ing. Gomez", "Bases de Datos");
        Profesor pC = new Profesor("P03", "Lic. Perez", "Ingenieria de Software");
        
        Curso c1 = new Curso("C101", "Programacion Orientada a Objetos");
        Curso c2 = new Curso("C102", "Disenio de Algoritmos");
        Curso c3 = new Curso("C201", "Sistemas Distribuidos");
        Curso c4 = new Curso("C202", "Redes de Computadoras");
        Curso c5 = new Curso("C301", "Inteligencia Artificial");
        
        System.out.println("\n--- TAREAS 2: AGREGAR PROFESORES Y CURSOS A UNIVERSIDAD ---");
        utn.agregarProfesor(pA);
        utn.agregarProfesor(pB);
        utn.agregarProfesor(pC);
        
        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);
        
        System.out.println("\n--- TAREA 3: ASIGNACION INICIAL ---");
        utn.asignarProfesorACurso("C101", "P01");
        utn.asignarProfesorACurso("C102", "P01");
        utn.asignarProfesorACurso("C201", "P02");
        utn.asignarProfesorACurso("C301", "P02");
        
        System.out.println("\n--- TAREAS 4: LISTAR CURSOS Y PROFESORES ---");
        utn.listarCursos();
        utn.listarProfesores();
        pA.listarCursos();
        pB.listarCursos();

        System.out.println("\n--- TAREA 5: CAMBIO DE PROFESOR (C101: P01 -> P03) ---");
        utn.asignarProfesorACurso("C101", "P03"); 
        
        System.out.println("\nVERIFICACION:");
        pA.listarCursos();
        pC.listarCursos();
        
        System.out.println("\n--- TAREA 6: ELIMINAR CURSO (C301) ---");
        utn.eliminarCurso("C301");
        
        System.out.println("\nVERIFICACION (P02):");
        pB.listarCursos();
        
        System.out.println("\n--- TAREA 7: ELIMINAR PROFESOR (P02 - Ing. Gomez) ---");
        utn.eliminarProfesor("P02"); 
        
        System.out.println("\nVERIFICACION (C201):");
        Curso c201 = utn.buscarCursoPorCodigo("C201");
        if (c201 != null) c201.mostrarInfo();
        utn.listarProfesores();
        
        System.out.println("\n--- TAREA 8: REPORTE ---");
        utn.reporteCursosPorProfesor();
    }
}
