/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;


public class ListaAlmacenes {
    private NodoAlmacen cabeza;
    private int length;
    
    public ListaAlmacenes() {
        this.length = 0;
        this.cabeza = null;
    }

    public NodoAlmacen getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoAlmacen cabeza) {
        this.cabeza = cabeza;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    /*
    @author León Serpa
    @params se le entrega un almacen al final de la lista
    */
    public void insertarFinal(String nombre, ListaInventario lista) {
        NodoAlmacen nodo = new NodoAlmacen(nombre, lista);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            NodoAlmacen pointer = getCabeza();
            while (pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
            }
            pointer.setSiguiente(nodo);
        }
        length++;
    }
    
    /*
    @author León Serpa
    @returns revisa si la lista esta vacia
    */
    
    public boolean estaVacia(){
            return getCabeza() == null;
        }
    
    /*
    @author León Serpa
    @returns devuelve un string con la informacion de almacenes e inventario con el formato inicial
    */
    
    public String ImprimirAlmacenes() {
        String str = "";
        NodoAlmacen pointer = getCabeza();
        while (pointer != null) {
            str += pointer.getListaItems();
            str += ";";
            pointer = pointer.getSiguiente();
            
        }
        return str;
    }
    
    /*
    @author León Serpa
    @returns devuelve el ultimo nodo de la lista
    */
    
    public NodoAlmacen getLast() {
        NodoAlmacen pointer = cabeza;
        while(pointer.getSiguiente() != null) {
            pointer = pointer.getSiguiente();
        }
        
        return pointer;
    }
    /*
    @author León Serpa
    @params se le indica el indice de la lista.
    @returns devuelve el nombre del almacen en esa posicion.
    */
    
    public String findName(int pos) {
        int count = 0;
        NodoAlmacen pointer = cabeza;
        while (count<pos) {
            pointer = pointer.getSiguiente();
            count++;
        }
        return pointer.getNombre();
    }
    
    /*
    @author León Serpa
    @params se le indica el nombre del almacen.
    @returns devuelve la posicion del almacen en la lista.
    */
    
    public int findPosition(String name) {
        NodoAlmacen pointer = cabeza;
        int count = 0;
        while (pointer != null) {
            if (pointer.getNombre().equals(name)){
                break;
            }
            pointer = pointer.getSiguiente();
            count++;
        }
        return count;
    }
    
    /*
    @author León Serpa
    @params se le indica el nombre del almacen
    @returns revisa si ya existe un almacen con ese nombre
    */
    
    public boolean nameExists(String name) {
        boolean exists = false;
        NodoAlmacen pointer = cabeza;
        while(pointer != null) {
            if (pointer.getNombre().equals(name)){
                exists = true;
            }
            pointer = pointer.getSiguiente();
            
        }
        return exists;
    }
    
    /*
    @author León Serpa
    @params se le indica el indice de la lista.
    @returns devuelve el nombre del almacen en esa posicion.
    */
    public NodoAlmacen findNodo(int pos) {
        int count = 0;
        NodoAlmacen pointer = cabeza;
        while (count<pos) {
            pointer = pointer.getSiguiente();
            count++;
        }
        return pointer;
    }
    
    /*
    @author León Serpa
    @returns resetea a todos los almacenes como no visitados (es para recorrer la lista en profundidad y por anchura).
    */
    public void ResetVisits() {
        NodoAlmacen pointer = cabeza;
        for (int i = 0; i<length;i++){
            pointer.setVisitado(false);
            pointer = pointer.getSiguiente();
        }
    }
}
