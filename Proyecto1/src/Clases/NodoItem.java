/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class NodoItem {
    
    private String[] items;
    private NodoItem siguiente;
    
    public NodoItem(String[] items) {
        this.items = items;
        this.siguiente = null;
    }
    /*
    @author León Serpa
    @returns devuelve un string con los items con el formato inicial
    */
    public String getItems() {
        String str = "";
        str +="\n"+ items[0] + "," + items[1];
        return str;
    }
    
    public String[] getItem() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }


    public NodoItem getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoItem siguiente) {
        this.siguiente = siguiente;
    }
    
}
