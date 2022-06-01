/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class NodoAlmacen {
    private String nombre;
    private ListaInventario ListaItems;
    private NodoAlmacen siguiente;
    
    public NodoAlmacen(String nombre, ListaInventario lista) {
        this.nombre = nombre;
        this.ListaItems = lista;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getListaItems() {
        String Str = "Almacen "+nombre+":\n" + this.ListaItems.ImprimirItems(); 
        return Str;
    }

    public void setListaItems(ListaInventario ListaItems) {
        this.ListaItems = ListaItems;
    }

    public NodoAlmacen getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAlmacen siguiente) {
        this.siguiente = siguiente;
    }
    
          
}
