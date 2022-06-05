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
    
    public boolean estaVacia(){
            return getCabeza() == null;
        }
    
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
    
    public NodoAlmacen getLast() {
        NodoAlmacen pointer = cabeza;
        while(pointer.getSiguiente() != null) {
            pointer = pointer.getSiguiente();
        }
        
        return pointer;
    }
    
    public String findName(int pos) {
        int count = 0;
        NodoAlmacen pointer = cabeza;
        while (count<pos) {
            pointer = pointer.getSiguiente();
            count++;
        }
        return pointer.getNombre();
    }
    
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
    
    public NodoAlmacen findNodo(int pos) {
        int count = 0;
        NodoAlmacen pointer = cabeza;
        while (count<pos) {
            pointer = pointer.getSiguiente();
            count++;
        }
        return pointer;
    }
    
    public void ResetVisits() {
        NodoAlmacen pointer = cabeza;
        for (int i = 0; i<length;i++){
            pointer.setVisitado(false);
            pointer = pointer.getSiguiente();
        }
    }
}
