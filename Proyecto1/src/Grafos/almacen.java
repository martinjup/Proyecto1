
package Grafos;

import java.util.HashMap;

public class almacen {
    
    //making a hashmap to store the products and their quantity
    private HashMap<String, Integer> products;

    //Constructor

    public almacen(){
        this.products = new HashMap<String, Integer>();
    }

    //Add a product to the hashmap

    public void addProduct(String product, int quantity){
        this.products.put(product, quantity);
    }

    //Remove a product from the hashmap

    public void removeProduct(String product){
        this.products.remove(product);
    }

    //Get the quantity of a product

    public int getQuantity(String product){
        return this.products.get(product);
    }

    //Get the size of the hashmap

    public int getSize(){
        return this.products.size();
    }

    public HashMap<String, Integer> getProducts() {
        return this.products;
    }

}
