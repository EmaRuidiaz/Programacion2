/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.CitaMedicaPacienteProfesional;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Diego Torres", "OSDE");
        Profesional profesional = new Profesional("Dra. Clara", "Cardiología");
        CitaMedica cita = new CitaMedica("2025-10-05", "10:30", paciente, profesional);

        System.out.println("Cita para: " + cita.getPaciente().getNombre());
        System.out.println("Con el profesional: " + cita.getProfesional().getNombre());
    }
}
