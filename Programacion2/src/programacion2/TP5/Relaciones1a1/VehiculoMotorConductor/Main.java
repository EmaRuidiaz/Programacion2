/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.VehiculoMotorConductor;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        Motor motor = new Motor("Gasolina", "M987654");
        Vehiculo auto = new Vehiculo("ABC-123", "Sedan", motor);
        Conductor conductor = new Conductor("Pedro Fernandez", "Licencia-A1");
        auto.setConductor(conductor);

        System.out.println("Vehiculo: " + conductor.getVehiculo().getPatente());
        System.out.println("Conductor del vehiculo: " + auto.getConductor().getNombre());
    }
}
