/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dominio;

import modelo.util.ItemComparable;

/**
 *
 * @author Alumno
 */
public class Pelicula{
    private String titulo;
    private double precio;

    public Pelicula(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }
    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    
    
    
}
