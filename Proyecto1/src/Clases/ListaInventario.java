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
    
    /*
    @author León Serpa
    @params se le da un elemento y lo inserta al final de la lista
    */
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
    
    /*
    @author León Serpa
    @params revisa si la lista esta vacia.
    */
    public boolean estaVacia(){
            return getCabeza() == null;
        }
    
    /*
    @author León Serpa
    @returns devuelve un string con el inventario con el formato inicial.
    */
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
    
    public NodoItem findProduct(String name) {
        NodoItem pointer = cabeza;
        while (pointer != null) {
            if (pointer.getItem()[0].equals(name)){
            break;}
            
            pointer = pointer.getSiguiente();
        }
        return pointer;
    }
    
    public int findPosition(String name) {
        NodoItem pointer = cabeza;
        int count = 0;
        while (pointer != null) {
            if (pointer.getItem()[0].equals(name)){
            break;}
            count++;
            pointer = pointer.getSiguiente();
        }
        return count;
    }
    
    
    public boolean ProductExists(String name) {
        boolean f = false;
        NodoItem pointer = cabeza;
        while (pointer != null) {
            if (pointer.getItem()[0].equals(name)){
            f = true;
            }
            pointer = pointer.getSiguiente();
        }
        return f;
    }
    
    public void InsertarFinal(String[] item) {
        NodoItem nodo = new NodoItem(item);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            NodoItem pointer = cabeza;
            while (pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
            }
            pointer.setSiguiente(nodo);
        }
        length++;
    }
    
    public void DeleteProduct(int pos) {
        if(!estaVacia()){
            NodoItem pointer = getCabeza();
            int cont = 0;
            while (cont < (pos - 1) && pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
                cont++;
            }
            NodoItem temp = pointer.getSiguiente();
            pointer.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(null);
            length--;
        }
    }
}
