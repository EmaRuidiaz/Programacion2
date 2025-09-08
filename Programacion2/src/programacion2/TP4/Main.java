/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP4;

/**
 *
 * @author ema_r
 */
public class Main {
    
    public static void main(String[] args) {
        //Instanciar varios objetos usando ambos constructores
        System.out.println("--- Instanciando Empleados ---");
        // Empleado con constructor completo
        Empleado empleado1 = new Empleado(101, "Ana Perez", "Gerente de Proyectos", 1500000.00);

        // Empleado con constructor parcial
        Empleado empleado2 = new Empleado("Juan Gomez", "Desarrollador Junior");
        
        // Otro empleado con constructor completo
        Empleado empleado3 = new Empleado(102, "Luis Ramirez", "Analista de Sistemas", 1150000.00);

        System.out.println("--- Informacion inicial de los empleados ---");
        System.out.println(empleado1.toString()); // Muestra la información de un objeto
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        
        System.out.println("\n--- Actualizando salarios ---");
        // Aplicar los metodos actualizarSalario()
        System.out.println("Aplicando aumento de 10% a Ana Perez...");
        empleado1.actualizarSalario(10.0); // Usa el metodo sobrecargado por porcentaje
        System.out.println(empleado1.toString());

        System.out.println("Aplicando aumento fijo de $50000 a Juan Gomez...");
        empleado2.actualizarSalario(50000); // Usa el metodo sobrecargado por cantidad fija
        System.out.println(empleado2.toString());

        System.out.println("Aplicando aumento fijo de $200000 a Luis Ramirez...");
        empleado3.actualizarSalario(200000);
        System.out.println(empleado3.toString());

        System.out.println("\n--- Total de Empleados ---");
        // Mostrar el total de empleados creados
        // Se llama al metodo estatico directamente desde la clase
        System.out.println("El total de empleados creados es: " + Empleado.mostrarTotalEmpleados());
    }
}
