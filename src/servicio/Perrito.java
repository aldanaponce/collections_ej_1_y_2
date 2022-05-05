/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Aldi
 */
public class Perrito {

    private ArrayList<String> lista;
    private String rta;
    Scanner read = new Scanner(System.in);

    public Perrito() {

        this.lista = new ArrayList();
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public String getRta() {
        return rta;
    }

    public void setRta(String rta) {
        this.rta = rta;
    }

    public void crearPerrito(Perrito p) {
        String rta = "s";

        do {
            System.out.println("ingrese la raza de su perrito");
            String raza = read.nextLine();
            lista.add(raza);
            System.out.println("desea agregar otro perrito? s/n");
            rta = read.nextLine();

        } while (rta.equals("s"));

    }

    public void mostrarPerritos(Perrito p) {
        System.out.println("lista de perritos (" + lista.size() + ")");
        for (String aux : lista) {
            System.out.println(aux);
        }
    }

    /*Al usuario se le pedirá un perro y se recorrerá la lista con un Iterator,
    se buscará el perro en la lista. Si el perro está en la lista, se eliminará el perro 
    que ingresó el usuario y se mostrará la lista ordenada. 
    Si el perro no se encuentra en la lista, se le informará al usuario y
    se mostrará la lista ordenada.*/
    public void eliminarPerrito(Perrito p) {
        Iterator<String> it = lista.iterator();

        System.out.println("Ingrese el nombre del perrito a eliminar: ");
        String delete = read.nextLine();
        while (it.hasNext()) {
            String aux = it.next();

            if (aux.equals(delete)) {
                it.remove();

            } else {
                System.out.println("Su perrito no se encuentra en la lista!");
                break;

            }

        }
        lista.forEach((e) -> System.out.println(e));

    }

}
