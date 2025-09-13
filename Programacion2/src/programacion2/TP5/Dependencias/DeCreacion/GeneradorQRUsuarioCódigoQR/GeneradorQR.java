/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Dependencias.DeCreacion.GeneradorQRUsuarioCódigoQR;

/**
 *
 * @author ema_r
 */
public class GeneradorQR {
    
    public CodigoQR generar(String valor, Usuario usuario) { // Dependencia de creación
        CodigoQR codigo = new CodigoQR(valor);
        codigo.setUsuario(usuario);
        System.out.println("QR Code generado para " + usuario.getNombre());
        return codigo;
    }
}
