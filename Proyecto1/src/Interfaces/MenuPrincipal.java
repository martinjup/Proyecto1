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


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.*;
/**
 *
 * @author Windows
 */
public class MenuPrincipal extends javax.swing.JFrame {

    Function func = new Function();
    MatrizAdyacencia grafo;
    ListaAlmacenes lista_inventario;
    
    public MenuPrincipal() {
        initComponents();
        this.setTitle("Proyecto 1");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
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
        jPanel1.add(CargarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 150, 50));

        GuardarDatos.setBackground(new java.awt.Color(255, 153, 153));
        GuardarDatos.setForeground(new java.awt.Color(0, 0, 0));
        GuardarDatos.setText("GUARDAR DATOS");
        GuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarDatosActionPerformed(evt);
            }
        });
        jPanel1.add(GuardarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 160, 50));

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
        jPanel1.add(RealizarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 170, 50));

        Reporte.setBackground(new java.awt.Color(255, 153, 153));
        Reporte.setForeground(new java.awt.Color(0, 0, 0));
        Reporte.setText("REPORTE DE PRODUCTOS");
        Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteActionPerformed(evt);
            }
        });
        jPanel1.add(Reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 170, 50));

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

        Mostrar.setColumns(20);
        Mostrar.setRows(5);
        jScrollPane1.setViewportView(Mostrar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 390, 260));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 360, 260));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Los Pollos Hermanos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 430, 80));

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
        func.agregar_almacen();
    }//GEN-LAST:event_AgregarAlmacenActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        ExitWindow salir = new ExitWindow();

    }//GEN-LAST:event_SalirActionPerformed

    private void CargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarArchivoActionPerformed
        JFileChooser file = new JFileChooser();
      file.setMultiSelectionEnabled(true);
      file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
      file.setFileHidingEnabled(false);
      if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
         java.io.File f = file.getSelectedFile();
         System.err.println(f.getPath());
         String contenido = func.leer_archivo(f.getPath());
        this.grafo = func.crear_matriz(contenido);
        Global.setMatriz(grafo);
        this.lista_inventario = func.crear_lista_inventario(contenido);
        Global.setLista_almacenes(lista_inventario);
      }
        
    }//GEN-LAST:event_CargarArchivoActionPerformed

    private void GuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarDatosActionPerformed
        String contenido = "";
        contenido += "Almacenes;";
        contenido += Global.getLista_almacenes().ImprimirAlmacenes();
        contenido += "\nRutas;\n";
        contenido += Global.getMatriz().ImprimirRutas();
        
                
        JOptionPane.showMessageDialog(null, contenido);
    }//GEN-LAST:event_GuardarDatosActionPerformed

    private void ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteActionPerformed
        func.imprimir_inventario();
    }//GEN-LAST:event_ReporteActionPerformed

    private void RealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarPedidoActionPerformed
        OrderProduct ventana = new OrderProduct();
        
    }//GEN-LAST:event_RealizarPedidoActionPerformed

    private void Gestional_AlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gestional_AlmacenActionPerformed
        ManageStorage gestion = new ManageStorage();
    }//GEN-LAST:event_Gestional_AlmacenActionPerformed

    private void MostrarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarGrafoActionPerformed
        this.Mostrar.setText(grafo.ImprimirGrafo());
    }//GEN-LAST:event_MostrarGrafoActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
