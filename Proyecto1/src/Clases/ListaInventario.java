/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


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
    
    public boolean estaVacia(){
            return getCabeza() == null;
        }
    
    public String ImprimirItems(){
        String str = "";
        NodoItem pointer = cabeza;
        while (pointer != null) {
            str += pointer.getItems() + "\n";
            pointer = pointer.getSiguiente();
        }
        return str;
    }
}
