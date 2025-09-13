/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Dependencias.DeCreacion.EditorVideoProyectoRender;

/**
 *
 * @author ema_r
 */
public class Render {
    
    private String formato;
    private Proyecto proyecto;

    public Render(String formato) {
        this.formato = formato;
    }

    // Método setter para la asociación unidireccional con el proyecto
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    
    public String getFormato() { return formato; }
}
