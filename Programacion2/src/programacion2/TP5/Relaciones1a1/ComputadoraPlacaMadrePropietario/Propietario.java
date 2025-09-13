/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.ComputadoraPlacaMadrePropietario;

/**
 *
 * @author ema_r
 */
public class Propietario {
    
    private String nombre;
    private String dni;
    private Computadora computadora;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setComputadora(Computadora computadora) { this.computadora = computadora; }
    public Computadora getComputadora() { return computadora; }
    public String getNombre() { return nombre; }
}
