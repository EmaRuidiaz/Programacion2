/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Dependencias.DeCreacion.EditorVideoProyectoRender;

/**
 *
 * @author ema_r
 */
public class EditorVideo {
    
    public Render exportar(String formato, Proyecto proyecto) { // Dependencia de creación
        Render render = new Render(formato);
        render.setProyecto(proyecto);
        System.out.println("Proyecto '" + proyecto.getNombre() + "' exportado a formato " + formato);
        return render;
    }
}
