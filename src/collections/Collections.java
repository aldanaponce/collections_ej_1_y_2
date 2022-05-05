/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.List;

import servicio.Perrito;

/**
 *
 * @author Aldi
 */
public class Collections {

    /*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
    El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
    después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
    decide salir, se mostrará todos los perros guardados en el ArrayList. 
    ----------2> 
    Al usuario se le pedirá un perro y se recorrerá la lista con un Iterator,
    se buscará el perro en la lista. Si el perro está en la lista, se eliminará el perro 
    que ingresó el usuario y se mostrará la lista ordenada. 
    Si el perro no se encuentra en la lista, se le informará al usuario y
    se mostrará la lista ordenada.
     */
    
    public static void main(String[] args) {
        Perrito p1 = new Perrito();
        p1.crearPerrito(p1);
        p1.mostrarPerritos(p1);
        p1.eliminarPerrito(p1);
    }

}
