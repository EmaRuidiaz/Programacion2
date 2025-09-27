/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP6.SistemaDeStock;

/**
 *
 * @author ema_r
 */
public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        System.out.println("--- TAREA 1: CREACION Y AGREGADO DE PRODUCTOS ---");
        Producto p1 = new Producto("A101", "Manzanas", 500.50, 150, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E202", "Smart TV 55", 2500.00, 15, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R303", "Camisa Algodon", 1500.00, 80, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H404", "Juego de Sabanas", 3200.75, 40, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("A105", "Leche Entera", 750.20, 200, CategoriaProducto.ALIMENTOS);
        Producto p6 = new Producto("E206", "Auriculares BT", 950.00, 120, CategoriaProducto.ELECTRONICA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        inventario.agregarProducto(p6);

        System.out.println("\n--- TAREA 2: LISTADO DE PRODUCTOS ---");
        inventario.listarProductos();

        System.out.println("\n--- TAREA 3: BUSQUEDA POR ID (E202) ---");
        Producto buscado = inventario.buscarProductoPorId("E202");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        System.out.println("\n--- TAREA 4: FILTRAR POR CATEGORIA (ROPA) ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ROPA);

        System.out.println("\n--- TAREA 5: ELIMINAR PRODUCTO (A101) Y LISTAR RESTANTES ---");
        inventario.listarProductos();
        inventario.eliminarProducto("A101");
        inventario.listarProductos();

        System.out.println("\n--- TAREA 6: ACTUALIZAR STOCK (E202) ---");
        inventario.actualizarStock("E202", 5);

        System.out.println("\n--- TAREA 7: TOTAL DE STOCK DISPONIBLE ---");
        System.out.println("Stock total en inventario: " + inventario.obtenerTotalStock());

        System.out.println("\n--- TAREA 8: PRODUCTO CON MAYOR STOCK ---");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("El producto con mayor stock es: " + mayorStock.getNombre() + 
                               " con " + mayorStock.getCantidad() + " unidades.");
        }

        System.out.println("\n--- TAREA 9: FILTRAR PRODUCTOS POR PRECIO ($1000 - $3000) ---");
        inventario.filtrarProductosPorPrecio(1000.00, 3000.00);

        System.out.println("\n--- TAREA 10: CATEGORIAS DISPONIBLES CON DESCRIPCION ---");
        inventario.mostrarCategoriasDisponibles();
    }
}
