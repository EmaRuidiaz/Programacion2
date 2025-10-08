/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP7.EmpleadosYPolimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ema_r
 */
public class Main {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new EmpleadoPlanta("Ana", 1450000.0));
        listaEmpleados.add(new EmpleadoTemporal("Beto", 500.0, 160));
        listaEmpleados.add(new EmpleadoPlanta("Carlos", 5000000.0));

        double totalSueldos = 0;

        for (Empleado emp : listaEmpleados) {
            double sueldo = emp.calcularSueldo();
            totalSueldos += sueldo;

            System.out.println(emp.getNombre() + " - Sueldo: $" + sueldo);

            if (emp instanceof EmpleadoPlanta) {
                System.out.println("    Tipo: Empleado de Planta");
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("    Tipo: Empleado Temporal");
            }
        }
        System.out.println("\nTotal de sueldos: $" + totalSueldos);
    }
}
