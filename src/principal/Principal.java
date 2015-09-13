/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import modelo.dominio.Pelicula;
import modelo.util.ItemComparable;
import modelo.util.PeliculaComparablePorPrecio;
import modelo.util.PeliculaComparablePorTitulo;
import modelo.util.Sort;

/**
 *
 * @author Alumno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ItemComparable p1 = new PeliculaComparablePorPrecio("Titulo C", 230.0);
        ItemComparable p2 = new PeliculaComparablePorPrecio("Titulo B", 240.0);
        ItemComparable p3 = new PeliculaComparablePorPrecio("Titulo A", 210.0);
        
        ItemComparable[] items = new ItemComparable[3];
        items[0] = p1;
        items[1] = p2;
        items[2] = p3;
        
        Sort.ordenarPorBurbuja(items);
        
        for(ItemComparable item:items){
            Pelicula p=(Pelicula)item;
            System.out.println("Titulo: "+p.getTitulo()+" - Precio: "+p.getPrecio());
        }
        
    }
}
