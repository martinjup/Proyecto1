
package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.*;


public class Function {
    
    public MatrizAdyacencia cargar_archivo() {
        /*
        No he hecho lo de fileChooser todavia
        */
        String path = "test\\amazon.txt";
        String contenido = leer_archivo(path);

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
