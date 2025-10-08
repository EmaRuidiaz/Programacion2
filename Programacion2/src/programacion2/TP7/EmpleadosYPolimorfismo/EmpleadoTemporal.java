/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP7.EmpleadosYPolimorfismo;

/**
 *
 * @author ema_r
 */
public class EmpleadoTemporal extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, double tarifaPorHora, int horasTrabajadas) {
        super(nombre);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return tarifaPorHora * horasTrabajadas;
    }
}
