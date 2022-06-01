
package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.*;


public class Function {

    
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
            char char1 = array_rutas2[i][0].charAt(0);
            int ascii1 = (int) char1 - 65;
            char char2 = array_rutas2[i][1].charAt(0);
            int ascii2 = (int) char2 - 65;
            int peso = Integer.parseInt(array_rutas2[i][2]);
            grafo.AñadirRuta(ascii1, ascii2, peso);
        }
        return grafo;
        
    }
     
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
            items[i] = almacenes_split[i][1].split("\n");
        }
        
        
        for (int i = 0; i < items.length;i++) {
            ListaInventario lista_inventario = new ListaInventario();
            String[][] aux = new String[items[i].length][2];
            for (int j = 0; j<items[i].length;j++) {
                aux[j][0] = items[i][j].split(",")[0];
                aux[j][1] = items[i][j].split(",")[1];
                String[] aux2 = new String[2];
                aux2[0] = aux[j][0];
                aux2[1] = aux[j][1];
                JOptionPane.showMessageDialog(null, aux2);
                lista_inventario.insertarFinal(aux2);
            }
            lista_almacenes.insertarFinal(almacenes_split[i][0].replace("Almacen ", ""), lista_inventario);
        }
        
        return lista_almacenes;
    }
           
    
        
       
    
    
   
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
            JOptionPane.showMessageDialog(null, e);
        }
        return contenido_txt;
    }
    
    public void guardar_archivo() {
        File file = new File("test//amazon.txt");
    }
    
    public void imprimir_inventario() {
        
    }
    
    public void imprimir_productos() {
        
    }
    
    public void realizar_pedido() {
        
    }
    
    public void solicitar_productos() {
        
    }
    
    public void agregar_almacen() {
        
    }
    
    public void gestionar_almacen() {
        
    }
    
    public void mostrar_grafo() {
        
    }
    
}
