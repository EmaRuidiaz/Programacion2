/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.PasaporteFotoTitular;

/**
 *
 * @author ema_r
 */
public class Pasaporte {
    
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        // Composición: la foto se crea junto con el pasaporte
        this.foto = new Foto(imagen, formato);
    }
    
    // Método setter para establecer la relación bidireccional
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null) {
            titular.setPasaporte(this);
        }
    }

    public String getNumero() { return numero; }
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }
}
