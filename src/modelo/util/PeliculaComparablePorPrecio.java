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
public class PeliculaComparablePorPrecio extends Pelicula implements ItemComparable{

    public PeliculaComparablePorPrecio(String titulo, double precio) {
        super(titulo, precio);
    }
    
    @Override
    public int comparar(Object otroItem) {
        int resultado = 0;
        if(this.getPrecio() < ((Pelicula)otroItem).getPrecio()){
            resultado = -1;
        }else{
            if(this.getPrecio() > ((Pelicula)otroItem).getPrecio()){
                resultado = 1;
            }
        }
        return resultado;
    }
    
}
