
package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.*;


public class Function {

    
    /*
    @author León Serpa
    @params se le entrega un String de todo el archivo leido
    @returns devuelve una matriz de adyacencia con las rutas
    */
    public MatrizAdyacencia crear_matriz(String contenido) {
        String rutas = contenido.split("Rutas;\n")[1];
        String[] array_rutas = rutas.split("\n");
        String[][] array_rutas2 = new String[array_rutas.length][];
        for (int i = 0; i < array_rutas.length; i++) {
            array_rutas2[i] = array_rutas[i].split(",");
        }
        String aux = "";

        for (int i = 0; i<array_rutas2.length;i++) {
            if (!aux.contains(array_rutas2[i][0])){
                aux += array_rutas2[i][0];
            }
            if (!aux.contains(array_rutas2[i][1])){
                aux += array_rutas2[i][1];
        }
        }
        MatrizAdyacencia grafo = new MatrizAdyacencia(aux.split("").length);
        for (int i = 0; i<array_rutas2.length;i++) {
            String str1 = array_rutas2[i][0];
            String str2 = array_rutas2[i][1];
            int peso = Integer.parseInt(array_rutas2[i][2]);
            grafo.AñadirRuta(Global.getLista_almacenes().findPosition(str1), Global.getLista_almacenes().findPosition(str2), peso);
        }
        return grafo;
        
    }
     
    /*
    @author León Serpa
    @params se le entrega un String de todo el archivo leido
    @returns devuelve una lista de los almacenes con el inventario
    */
    public ListaAlmacenes crear_lista_inventario(String contenido) {
        ListaAlmacenes lista_almacenes = new ListaAlmacenes();
        
        String inventario = contenido.split("Rutas;\n")[0];
        inventario = inventario.replace("Almacenes;\n", "");
        String[] almacenes = inventario.split(";");
        
        String[][] almacenes_split = new String[almacenes.length-1][2];

        for (int i = 0; i < almacenes.length-1;i++) {
            almacenes_split[i][0] = almacenes[i].split(":\n")[0];
            almacenes_split[i][1] = almacenes[i].split(":\n")[1];
        }
        
        String[][] items = new String[almacenes_split.length][];
        
        for (int i = 0; i < almacenes_split.length;i++) {
            if ("".equals(items[i])) {
                items[i] = null;
            } else{
            items[i] = almacenes_split[i][1].split("\n");
            }
        }
        
        
        for (int i = 0; i < items.length;i++) {
            ListaInventario lista_inventario = new ListaInventario();
            if (items[i] != null){
                String[][] aux = new String[items[i].length][2];
            for (int j = 0; j<items[i].length;j++) {
                aux[j][0] = items[i][j].split(",")[0];
                aux[j][1] = items[i][j].split(",")[1];
                String[] aux2 = new String[2];
                aux2[0] = aux[j][0];
                aux2[1] = aux[j][1];
                lista_inventario.insertarFinal(aux2);
            }
            
            } else {
                lista_inventario.insertarFinal(null);
            }
            lista_almacenes.insertarFinal(almacenes_split[i][0].replace("Almacen ", "").replace("\n", ""), lista_inventario);
        }
        
        return lista_almacenes;
    }
    
    /*
    @author León Serpa
    @params se le entrega un String de la direccion del archivo
    @returns lee el archivo y devuelve un string identico al contenido del archivo
    */
   
    public String leer_archivo(String path) {
        String contenido_txt = "";
        String line;
        File file = new File(path);
        try {
            if (!file.exists()){
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        contenido_txt += line + "\n";
                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa");
              
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");
        }
        return contenido_txt;
    }
    
    /*
    @author León Serpa
    @params se le entrega un String ya con el formato inicial y lo sobreescribe sobre amazon.txt
    */
    
    public void guardar_archivo(String contenido) {
        PrintWriter pw;
        try {
            pw = new PrintWriter("test\\amazon.txt");
            pw.print(contenido);
            pw.close();
            JOptionPane.showMessageDialog(null, "Guardado exitoso!");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al guardar los datos.");
        }
        
    }
    
    /*
    @author León Serpa
    @returns recorre la lista y cuando encuentra una ruta, empieza a recorrer esa columna
    hasta que ya no hayan mas vertices, si todavia no esta vacia, la sigue recorriendo.
    Devuelve un string con toda la informacion.
    */
    
    public String recorrido_en_profundidad(){
        String str = "";
        MatrizAdyacencia aux = new MatrizAdyacencia(Global.getMatriz().getN());
        for(int i = 0; i<aux.getN();i++) {
            for(int j = 0; j<aux.getN();j++) {
                aux.setNodo(i, j, Global.getMatriz().get_Matriz()[i][j]);
            }
        }
        
        int fila = 0;
        int columna = 0;
        for(int i = 0; i<aux.getN();i++){
            for (int j = 0; j<Global.getMatriz().getN();j++){
                if (aux.get_Matriz()[i][j]!= 0) {
                    fila = i;
                    columna = j;                    
                    if (!Global.getLista_almacenes().findNodo(i).Visitado()){
                        str += Global.getLista_almacenes().findNodo(i).getListaItems();
                        str +="\n---------------------------\n";
                        Global.getLista_almacenes().findNodo(i).setVisitado(true);
                    }
          
                    aux.setNodo(i, j, 0);
                    
                    while(!aux.FilaVacia(fila) && !aux.ColumnaVacia(columna)){
                        for (int k = 0; k<aux.getN();k++) {
                            if(aux.get_Matriz()[k][columna] !=0){
                                if (!Global.getLista_almacenes().findNodo(columna).Visitado()){
                                    str += Global.getLista_almacenes().findNodo(columna).getListaItems();
                                    str +="\n---------------------------\n";
                                    Global.getLista_almacenes().findNodo(columna).setVisitado(true);
                                    fila = k;
                                    aux.setNodo(k, columna, 0);
                                    break;
                                } 
                            }     
                        }
                        for (int k = 0; k<aux.getN();k++){
                            if (aux.get_Matriz()[fila][k]!= 0){
                                if (!Global.getLista_almacenes().findNodo(fila).Visitado()){
                                    str += Global.getLista_almacenes().findNodo(fila).getListaItems();
                                    str +="\n---------------------------\n";
                                    Global.getLista_almacenes().findNodo(fila).setVisitado(true);
                                    columna = k;
                                    aux.setNodo(fila, k, 0);
                                    break;
                            }
                        }
                        }
                        
                    }
                    if (aux.EstaVacia()){
                        Global.getLista_almacenes().ResetVisits();
                        return str;
                    }
                    

            }
            }
        }
        Global.getLista_almacenes().ResetVisits();
        return str;
    }
    
    /*
    @author León Serpa
    @returns recorre la matriz for fila para llegar primero a todos los vertices adyacentes
    y devuelve un string con toda la informacion ya ordenada.
    */
    public String recorrido_por_anchura(){
        String str = "";
        MatrizAdyacencia aux = new MatrizAdyacencia(Global.getMatriz().getN());
        for(int i = 0; i<aux.getN();i++) {
            for(int j = 0; j<aux.getN();j++) {
                aux.setNodo(i, j, Global.getMatriz().get_Matriz()[i][j]);
            }
        }
        for(int i = 0; i<aux.getN();i++){
            for(int j = 0; j<aux.getN();j++){
                if (!Global.getLista_almacenes().findNodo(i).Visitado()){
                    str += Global.getLista_almacenes().findNodo(i).getListaItems();
                    str +="\n---------------------------\n";
                    Global.getLista_almacenes().findNodo(i).setVisitado(true);}
                if (aux.get_Matriz()[i][j] != 0){
                    if (!Global.getLista_almacenes().findNodo(i).Visitado()){
                    str += Global.getLista_almacenes().findNodo(i).getListaItems();
                    str +="\n---------------------------\n";
                    Global.getLista_almacenes().findNodo(i).setVisitado(true);}
                }
                    
            }
        }
        
        return str;
    }
    
}
