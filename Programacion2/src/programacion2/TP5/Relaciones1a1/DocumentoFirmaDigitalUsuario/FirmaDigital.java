/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.DocumentoFirmaDigitalUsuario;

/**
 *
 * @author ema_r
 */
public class FirmaDigital {
    
    private String codigoHash;
    private String fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        // Agregación
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    public String getCodigoHash() { return codigoHash; }
}
