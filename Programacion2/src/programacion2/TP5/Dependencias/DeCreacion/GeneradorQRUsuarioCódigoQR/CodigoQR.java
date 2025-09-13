/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Dependencias.DeCreacion.GeneradorQRUsuarioCódigoQR;

/**
 *
 * @author ema_r
 */
public class CodigoQR {
    
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    // Método setter para la asociación unidireccional con el usuario
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String getValor() { return valor; }
}
