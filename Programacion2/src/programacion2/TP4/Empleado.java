/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP4;

/**
 *
 * @author ema_r
 */
public class Empleado {
    
    // Atributos de instancia (encapsulados)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático
    private static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // Incrementa el contador cada vez que se crea un objeto
    }

    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados; // Asigna un ID basado en el contador y luego lo incrementa
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000000.00; // Salario por defecto
    }

    // Métodos sobrecargados para actualizar el salario
    public void actualizarSalario(double porcentaje) {
        this.salario *= (1 + porcentaje / 100);
    }

    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }

    // Método toString() para representar el objeto
    @Override
    public String toString() {
        return "ID: " + this.id + ", Nombre: " + this.nombre + ", Puesto: " + this.puesto + ", Salario: " + String.format("%.2f", this.salario);
    }

    // Método estático para mostrar el total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters y Setters para todos los atributos de instancia
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
