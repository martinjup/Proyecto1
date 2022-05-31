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
    
    public void insertarPrincipio(String nombre, ListaInventario lista) {
        NodoAlmacen nodo = new NodoAlmacen(nombre, lista);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            nodo.setSiguiente(getCabeza());
            setCabeza(nodo);
        }
        length++;
    }
    
    public boolean estaVacia(){
            return getCabeza() == null;
        }
    
    public String ImprimirAlmacenes() {
        String str = "";
        NodoAlmacen pointer = getCabeza();
        while (pointer.getSiguiente() != null) {
            str += pointer.getListaItems();
            pointer = pointer.getSiguiente();
            
        }
        return str;
    }
}
