/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;


public class ListaInventario {
    private NodoItem cabeza;
    private int length;
    
    public ListaInventario(){
        this.length = 0;
        this.cabeza = null;
    }

    public NodoItem getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoItem cabeza) {
        this.cabeza = cabeza;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public void insertarPrincipio(String[] elemento) {
        NodoItem nodo = new NodoItem(elemento);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            nodo.setSiguiente(getCabeza());
            setCabeza(nodo);
        }
        length++;
    }
    
    public void insertarFinal(String[] elemento) {
        NodoItem nodo = new NodoItem(elemento);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            NodoItem pointer = getCabeza();
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
    
    public String ImprimirItems(){
        String str = "";
        NodoItem pointer = cabeza;
        while (pointer != null) {
            if (pointer.getItems() != null){
            str += pointer.getItems();
            } else{
                JOptionPane.showMessageDialog(null, pointer.getItems()+"a");
            }
            pointer = pointer.getSiguiente();
        }
        return str;
    }
}
