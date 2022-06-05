
package Grafos;

import java.util.HashMap;

public class almacen {
    //@author Martin Ojanguren
    //hacer un hashmap para almacenar los productos y su cantidad
    private HashMap<String, Integer> products;

    //Constructor

    public almacen(){
        this.products = new HashMap<String, Integer>();
    }

    //Añadir un producto a hashmap

    public void addProduct(String product, int quantity){
        this.products.put(product, quantity);
    }

    //quitar un producto hashmap

    public void removeProduct(String product){
        this.products.remove(product);
    }

    //cantidad del producto

    public int getQuantity(String product){
        return this.products.get(product);
    }

    //obtener tamaño de hashmap

    public int getSize(){
        return this.products.size();
    }

    public HashMap<String, Integer> getProducts() {
        return this.products;
    }

}
