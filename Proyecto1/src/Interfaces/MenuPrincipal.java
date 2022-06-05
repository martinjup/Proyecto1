/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Function;
import Clases.Global;
import Clases.MatrizAdyacencia;
import Clases.ListaAlmacenes;
import Grafos.Archivos;
import Grafos.Rutas;
import Grafos.almacen;
import Grafos.graph;
import Grafos.node;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.Color;
/**
 *
 * @author Windows
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    /**
     * Atributos del menu principal
    */
    
    Function func = new Function();
    MatrizAdyacencia grafo;
    ListaAlmacenes lista_inventario;
    static Rutas matriz;
    static ArrayList<almacen> almacenes;
    
    
    /**
     * Constructor
     * Establece el tamaño y nombre de la ventana
     * Carga los datos base del proyecto desde el archivo amazon.txt
    */
    public MenuPrincipal() {
        initComponents();
        this.setTitle("Proyecto 1");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        String contenido= "";
        String line;
        String path = "test\\amazon.txt";
        File file = new File(path);
        try{
            if (!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        contenido += line+"\n";
                    }
                }
                //Se crea la lista de inventario de los almacenes
                lista_inventario = func.crear_lista_inventario(contenido);
                Global.setLista_almacenes(lista_inventario);
                //Se crea la matriz de adyacencia que representa el grafo
                grafo = func.crear_matriz(contenido);
                Global.setMatriz(grafo);
                //Se instancia Archivos para leer el archivo y poder imprimirlo despues
                Archivos fh = new Archivos();
                //Se guardan tanto la lista de almacenes como la matriz de adyacencia
                ArrayList<Object> retorno = fh.readFile(file.getAbsolutePath());
                ArrayList<almacen> almacenes = (ArrayList) retorno.get(0);
                Rutas Matrix = (Rutas) retorno.get(1);
                //Se asginan la matriz de adyacencia y la lista de almacenes a los atributos de la clase para poder visualizar el grafo
                this.almacenes = almacenes;
                this.matriz = Matrix;
                }
            } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos guardados");
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CargarArchivo = new javax.swing.JButton();
        GuardarDatos = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        RealizarPedido = new javax.swing.JButton();
        Reporte = new javax.swing.JButton();
        AgregarAlmacen = new javax.swing.JButton();
        Gestional_Almacen = new javax.swing.JButton();
        MostrarGrafo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mostrar = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CargarArchivo.setBackground(new java.awt.Color(255, 153, 153));
        CargarArchivo.setForeground(new java.awt.Color(0, 0, 0));
        CargarArchivo.setText("CARGAR ARCHIVO");
        CargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(CargarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 170, 50));

        GuardarDatos.setBackground(new java.awt.Color(255, 153, 153));
        GuardarDatos.setForeground(new java.awt.Color(0, 0, 0));
        GuardarDatos.setText("GUARDAR DATOS");
        GuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarDatosActionPerformed(evt);
            }
        });
        jPanel1.add(GuardarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 180, 50));

        Salir.setBackground(new java.awt.Color(255, 51, 51));
        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, 100, 40));

        RealizarPedido.setBackground(new java.awt.Color(255, 153, 153));
        RealizarPedido.setForeground(new java.awt.Color(0, 0, 0));
        RealizarPedido.setText("REALIZAR PEDIDO");
        RealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarPedidoActionPerformed(evt);
            }
        });
        jPanel1.add(RealizarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 180, 50));

        Reporte.setBackground(new java.awt.Color(255, 153, 153));
        Reporte.setForeground(new java.awt.Color(0, 0, 0));
        Reporte.setText("REPORTE DE PRODUCTOS");
        Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteActionPerformed(evt);
            }
        });
        jPanel1.add(Reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 180, 50));

        AgregarAlmacen.setBackground(new java.awt.Color(255, 153, 153));
        AgregarAlmacen.setForeground(new java.awt.Color(0, 0, 0));
        AgregarAlmacen.setText("AGREGAR ALMACEN");
        AgregarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAlmacenActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 150, 50));

        Gestional_Almacen.setBackground(new java.awt.Color(255, 153, 153));
        Gestional_Almacen.setForeground(new java.awt.Color(0, 0, 0));
        Gestional_Almacen.setText("GESTIONAR ALMACEN");
        Gestional_Almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gestional_AlmacenActionPerformed(evt);
            }
        });
        jPanel1.add(Gestional_Almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 160, 50));

        MostrarGrafo.setBackground(new java.awt.Color(255, 153, 153));
        MostrarGrafo.setForeground(new java.awt.Color(0, 0, 0));
        MostrarGrafo.setText("MOSTRAR GRAFO");
        MostrarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarGrafoActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 170, 50));

        Mostrar.setBackground(new java.awt.Color(153, 255, 255));
        Mostrar.setColumns(20);
        Mostrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Mostrar.setForeground(new java.awt.Color(0, 0, 0));
        Mostrar.setRows(5);
        jScrollPane1.setViewportView(Mostrar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 390, 260));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Los Pollos Hermanos");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)), null));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 430, 80));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Matriz de Adyacencia");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 160, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 280, 280));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 823, 570));

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 860, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAlmacenActionPerformed
        if (Global.getLista_almacenes() == null || Global.getMatriz() == null) {
            JOptionPane.showMessageDialog(null, "No hay un grafo guardado");
        } else {
            AddStorage ventana3 = new AddStorage();
            
        }
        
    }//GEN-LAST:event_AgregarAlmacenActionPerformed
    
    /**
     * @param evt Evento que se dispara cuando se cierra la ventana
    */
    
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        ExitWindow salir = new ExitWindow();

    }//GEN-LAST:event_SalirActionPerformed
    
    /**
     * @param evt Evento que se dispara cuando se oprime el boton cargar archivo
    */
    private void CargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarArchivoActionPerformed
        JFileChooser file = new JFileChooser();
      file.setMultiSelectionEnabled(true);
      file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
      file.setFileHidingEnabled(false);
      if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
         java.io.File f = file.getSelectedFile();
         String contenido = func.leer_archivo(f.getPath());
        lista_inventario = func.crear_lista_inventario(contenido);
        Global.setLista_almacenes(lista_inventario);
        grafo = func.crear_matriz(contenido);
        Global.setMatriz(grafo);
        
        Archivos fh = new Archivos();
        
        ArrayList<Object> retorno = fh.readFile(file.getSelectedFile().getAbsolutePath());
        ArrayList<almacen> almacenes = (ArrayList) retorno.get(0);
        Rutas Matrix = (Rutas) retorno.get(1);
        
        this.almacenes = almacenes;
        this.matriz = Matrix;
      }
        
    }//GEN-LAST:event_CargarArchivoActionPerformed
    /**
     * @param evt el evento que se dispara cuando se oprime el boton guardar
     * @return void guarda los datos cargados desde el txt
    */
    private void GuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarDatosActionPerformed
        if (Global.getLista_almacenes() != null){
            try{
                String contenido = "";
                contenido += "Almacenes;";
                contenido += Global.getLista_almacenes().ImprimirAlmacenes();
                contenido += "\nRutas;\n";
                contenido += Global.getMatriz().ImprimirRutas();
                func.guardar_archivo(contenido);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al guardar los datos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay un archivo guardado");
        }
            
    }//GEN-LAST:event_GuardarDatosActionPerformed

    private void ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteActionPerformed
        if (Global.getLista_almacenes() == null || Global.getMatriz() == null) {
            JOptionPane.showMessageDialog(null, "No hay un grafo guardado");
        } else {
            ProductReport ventana1 = new ProductReport();
        }
    }//GEN-LAST:event_ReporteActionPerformed

    private void RealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarPedidoActionPerformed

        if (Global.getLista_almacenes() == null || Global.getMatriz() == null) {
            JOptionPane.showMessageDialog(null, "No hay un grafo guardado");
        } else {
            OrderProduct ventana2 = new OrderProduct();
        }
        
    }//GEN-LAST:event_RealizarPedidoActionPerformed

    private void Gestional_AlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gestional_AlmacenActionPerformed
        if (Global.getLista_almacenes() == null || Global.getMatriz() == null) {
            JOptionPane.showMessageDialog(null, "No hay un grafo guardado");
        } else {
            ManageStorage ventana4 = new ManageStorage();
        }

    }//GEN-LAST:event_Gestional_AlmacenActionPerformed
    /**
    * @Param evt es el evento cuando se le da click al boton mostrar grafo
    * @return Void, Genera un frame en donde se visualiza el grafo
    */
    private void MostrarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarGrafoActionPerformed
        if(Global.getMatriz() != null){
            Mostrar.setText(Global.getMatriz().ImprimirGrafo());
            JFrame frame = new JFrame("Grafo");
            ArrayList<node> nodos = new ArrayList<>();
            ArrayList<Color> colores = new ArrayList<>();
            //Genera colores al azar para pintar los vertices del grafo
            for(int i = 0; i < almacenes.size(); i++){
                colores.add(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
            }

            //Genera los vertices asignandoles su color y nombre
            for(int i=0; i<almacenes.size();i++){
                node vertex = new node();
                //Se distrbuyen los vertices con la funcion seno y coseno para que esten distribuidos en un circulo, la cantidad de almacenes e i
                String aux = Character.toString(vertex.convert(i));
                vertex.setValues( (int) (250+ 200*(Math.cos((2*Math.PI/almacenes.size())*i) )),(int) (250+ 200*(Math.sin((2*Math.PI/almacenes.size())*i))), 50, colores.get(i),aux);
                nodos.add(vertex);
                
            }
            frame.setVisible(true);
            frame.setSize(500,500);
            
            graph g = new graph(nodos,matriz);

            frame.add(g);
        } else {
            JOptionPane.showMessageDialog(null, "No hay un grafo guardado");
        }
    }//GEN-LAST:event_MostrarGrafoActionPerformed
    
    /**
     * @return Rutas (Matriz de adyacencia del grafo)
    */
    
    public static Rutas getMatrix(){
        return MenuPrincipal.matriz;
    }
    
    /**
     * @return `int` devuelve el tamaño de la lista de almacenes
    */
    public static int Size(){
        return MenuPrincipal.almacenes.size();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarAlmacen;
    private javax.swing.JButton CargarArchivo;
    private javax.swing.JButton Gestional_Almacen;
    private javax.swing.JButton GuardarDatos;
    private javax.swing.JTextArea Mostrar;
    private javax.swing.JButton MostrarGrafo;
    private javax.swing.JButton RealizarPedido;
    private javax.swing.JButton Reporte;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
