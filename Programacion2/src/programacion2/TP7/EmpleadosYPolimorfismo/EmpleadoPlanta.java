/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP7.EmpleadosYPolimorfismo;

/**
 *
 * @author ema_r
 */
public class EmpleadoPlanta extends Empleado{
    private double sueldoFijo;

    public EmpleadoPlanta(String nombre, double sueldoFijo) {
        super(nombre);
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    public double calcularSueldo() {
        return sueldoFijo;
    }
}
