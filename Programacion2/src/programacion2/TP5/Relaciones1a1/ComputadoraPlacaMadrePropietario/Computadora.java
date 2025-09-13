/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.TP5.Relaciones1a1.ComputadoraPlacaMadrePropietario;

/**
 *
 * @author ema_r
 */
public class Computadora {
    
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String placaModelo, String placaChipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        // Composición
        this.placaMadre = new PlacaMadre(placaModelo, placaChipset);
    }

    // Método setter para la relación bidireccional
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null) {
            propietario.setComputadora(this);
        }
    }

    public String getMarca() { return marca; }
    public PlacaMadre getPlacaMadre() { return placaMadre; }
}
