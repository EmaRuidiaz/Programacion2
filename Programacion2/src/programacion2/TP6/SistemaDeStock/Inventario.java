/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP6.SistemaDeStock;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ema_r
 */
public class Inventario {
    private List<Producto> productos;
    
    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p) {
        if (buscarProductoPorId(p.getId()) == null) {
            productos.add(p);
            System.out.println("\nProducto agregado: " + p.getNombre());
        } else {
            System.out.println("\nError: Ya existe un producto con el ID: " + p.getId());
        }
    }
    
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("\nInventario vacio. No hay productos para listar.");
            return;
        }
        System.out.println("\n--- LISTADO COMPLETO DE PRODUCTOS (" + productos.size() + ") ---");
        for (Producto p : productos) {
            System.out.println(p.toString());
        }
        System.out.println("---------------------------------------------------------");
    }
    
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }
    
    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("\nProducto eliminado: " + p.getNombre());
            return true;
        }
        System.out.println("\nError al eliminar: Producto con ID " + id + " no encontrado.");
        return false;
    }
    
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("\nStock actualizado para " + p.getNombre() + ". Nuevo stock: " + nuevaCantidad);
            return true;
        }
        System.out.println("\nError al actualizar stock: Producto con ID " + id + " no encontrado.");
        return false;
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\n--- PRODUCTOS EN LA CATEGORIA: " + categoria.name() + " ---");
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                System.out.println(p.toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron productos en la categoría " + categoria.name() + ".");
        }
        System.out.println("-------------------------------------------------------------");
    }
    
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }
    
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto productoConMayorStock = productos.get(0); 
        for (Producto productoActual : productos) { 
            if (productoActual.getCantidad() > productoConMayorStock.getCantidad()) {
                productoConMayorStock = productoActual;
            }
        }
        return productoConMayorStock;
    }
    
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("\n--- PRODUCTOS CON PRECIO ENTRE $" + min + " y $" + max + " ---");
        boolean encontrado = false;
        for (Producto p : productos) {
            double precio = p.getPrecio();
            if (precio >= min && precio <= max) {
                System.out.println(p.toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron productos en ese rango de precios.");
        }
        System.out.println("------------------------------------------------------------------");
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- CATEGORIAS DISPONIBLES ---");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("- " + categoria.name() + ": " + categoria.getDescripcion());
        }
        System.out.println("------------------------------");
    }
}
