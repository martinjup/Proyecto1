
package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class Function {
    
    public void cargar_archivo() {
        String path = "test\\amazon.txt";
        String contenido = leer_archivo(path);
        
        
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
