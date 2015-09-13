/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.util;

/**
 *
 * @author Alumno
 */
public interface ItemComparable {
    /* 0 si ambos objetos son iguales
     * -1 si el objeto itemCompable es menor que otroItem
     * 1 si el objeto itemComparable es mayor que otroItem 
     */
    int comparar(Object otroItem);
    
}
