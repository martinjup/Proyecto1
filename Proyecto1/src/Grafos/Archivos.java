
package Grafos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Archivos {
    
    //Es una funcion que devuelve Una lista generica que tendra la lista de rutas y la lista de almacenes
 
    public ArrayList<Object> readFile(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            //Lista de para tener cada uno de los almacenes
            ArrayList<almacen> almacenes = new ArrayList<almacen>();
            int first=-1;
            int quant;
            ArrayList<String> raw_warehose = new ArrayList<String>();
            ArrayList<String> raw_Routes = new ArrayList<String>();
            //Booleano para saber cuando empieza la parte de rutas en el archivo
            boolean flag_graph = false;
            while((line = br.readLine()) != null) {
                first++;
                //Verificar si la primera linea dice almaneces
                if (first==0){
                    if (!line.equals("Almacenes;")){
                        System.out.println("Error: La primera linea debe contener 'Almacenes'");
                        return null; 
                    } 
                }
                else{
                    //Si ya paso de la segunda linea y no termina en : entonces ya esta en los productos del almacen
                    if (first > 0 && !flag_graph && (!line.endsWith(";") || !line.startsWith("Rutas"))){
                        //Se agrega a una lista que tendra en crudo todos los productos de cada almacen
                        raw_warehose.add(line);
                    }
                //Si la linea empieza por Rutas entonces ya seria la parte del grafo (por eso el booleano)
                if (line.startsWith("Rutas") || flag_graph){
                    flag_graph = true;
                    //Se agrega a una lista que tendra en crudo todos los almacenes de cada ruta
                    raw_Routes.add(line);
                }

            }
            }
            //Cierro el buffer de datos
            br.close();
            //Recorrer la lista de los almacenes y crear una instancia para c/u
            for (int i = 0; i< raw_warehose.size() ; i++){
                String value = raw_warehose.get(i).toString();
                int aux = i;
                //Si el valor (Linea) termina en : quiere decir que es un nuevo almacen
                if (value.endsWith(":")){
                    //Creo la instancia de almacen
                    almacen a = new almacen();
                    //Siempre que el ultimo caracter de la linea sea diferente ; es un producto de un almacen
                    while (!value.endsWith(";")){
                        aux++;
                        value = raw_warehose.get(aux).toString();
                        //Separo el nombre del producto y el stock
                        String[] product_quantity = value.split(",");
                        String product = product_quantity[0];
                        String quantity = product_quantity[1];
                        //Validacion para cuando sea el ultimo producto pueda convertir la cantidad a int
                        if (value.endsWith(";")){
                            StringBuffer auxiliar = new StringBuffer(quantity);
                            auxiliar.deleteCharAt(auxiliar.length()-1);
                            quant = Integer.parseInt(auxiliar.toString());
                        }else{
                            quant = Integer.parseInt(quantity);
                        }
                        //Agregago el producto al almacen
                        a.addProduct(product, quant);
                    }            
                    //Agregar el almacen a la lista de almacenes
                    almacenes.add(a);
                }
            }
            //Elimino la primera instancia de la lista rutas porque dice 'Rutas;'
            raw_Routes.remove(0);
            //Creando la matriz de adyacencia
            Rutas Matrix = new Rutas(almacenes.size());
            //Recorrer la lista de rutas y crear una instancia para c/u
            for (int i =0 ; i < raw_Routes.size() ; i++){
                String[] div = raw_Routes.get(i).split(",");
                //Convirtiendo las letras en numeros
                int v1 = convert(div[0],raw_Routes);
                int v2 = convert(div[1],raw_Routes);

                Matrix.addEdge(v1, v2, Integer.parseInt(div[2]));
                
            }
        //Se crea el arraylist que va a devolver la funcion
        ArrayList<Object> retorno = new ArrayList<>();
        //Se agrega tanto la lista de almacenes como la matriz de adyacencia
        retorno.add(almacenes);
        retorno.add(Matrix);
        return retorno;
        } catch (IOException e) {
            System.out.println("Archivo no encontrado...");
            return null;
            
        }
    }

    public int convert(String value, ArrayList<String> almacenes) {
        //Funcion que sirve para dada una letra A,B,C etc, devolver el numero que le corresponde
        int aux = almacenes.size();
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i=0; i< aux; i++){
            if (value.charAt(0) == abc.charAt(i)){
                return i;
            }
        }
        //Si no encuentra la letra devuelve -1
        return -1;
        
    }

}
