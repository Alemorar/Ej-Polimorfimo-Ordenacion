/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.util;

import modelo.dominio.Pelicula;

/**
 *
 * @author Alumno
 */
public class PeliculaComparablePorTitulo extends Pelicula implements ItemComparable{

    public PeliculaComparablePorTitulo(String titulo, double precio) {
        super(titulo, precio);
    }
    
    
    @Override
    public int comparar(Object otroItem) {
        return this.getTitulo().compareTo(((Pelicula)otroItem).getTitulo());
    }
    
}
