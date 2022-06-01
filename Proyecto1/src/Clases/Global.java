/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class Global {
    private static ListaAlmacenes lista_almacenes;
    private static MatrizAdyacencia matriz;

    public static ListaAlmacenes getLista_almacenes() {
        return lista_almacenes;
    }

    public static void setLista_almacenes(ListaAlmacenes lista_almacenes) {
        Global.lista_almacenes = lista_almacenes;
    }

    public static MatrizAdyacencia getMatriz() {
        return matriz;
    }

    public static void setMatriz(MatrizAdyacencia matriz) {
        Global.matriz = matriz;
    }
    
}
