/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;

import Clases.MatrizAdyacencia;
import Clases.ListaAlmacenes;
import Clases.Global;
import Clases.Function;

public class AddStorage extends javax.swing.JFrame {

    
    public AddStorage() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    AddStorage(MatrizAdyacencia matriz) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        jPanel2 = new javax.swing.JPanel();
        route = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AddStorage = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        route.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeActionPerformed(evt);
            }
        });
        jPanel2.add(route, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 220, -1));

        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Ingrese el nombre de este almacen.");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 220, 20));

        AddStorage.setBackground(new java.awt.Color(255, 102, 102));
        AddStorage.setForeground(new java.awt.Color(0, 0, 0));
        AddStorage.setText("Nombrar");
        AddStorage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStorageActionPerformed(evt);
            }
        });
        jPanel2.add(AddStorage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 110, -1));

        Salir.setBackground(new java.awt.Color(255, 0, 0));
        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setText("X");
        Salir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel2.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 50, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void routeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routeActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed
    
    /*
    *@author León Serpa
    *añade un almacen con el nombre escrito
    */
    private void AddStorageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStorageActionPerformed
        // valida que no este vacio y que no exista un almacen con ese nombre
        if ("".equals(route.getText())){
            JOptionPane.showMessageDialog(null, "Por favor ingrese un nombre");
        } else{
            if (Global.getLista_almacenes().nameExists(route.getText())) {
                JOptionPane.showMessageDialog(null, "Ya hay un almacen con ese nombre.");
                route.setText("");
            } else{
                String Route = route.getText();
                //lo añade a la lista de almacenes y crea una matriz de una dimension mas grande
                ListaAlmacenes lista = Global.getLista_almacenes();
                lista.insertarFinal(Route, null);
                Global.setLista_almacenes(lista);
                MatrizAdyacencia matriz = new MatrizAdyacencia(Global.getMatriz().getN()+1);
                int[][] aux = new int[Global.getMatriz().getN()+1][Global.getMatriz().getN()+1];
                for (int i = 0; i<Global.getMatriz().getN();i++) {
                    for (int j = 0; j<Global.getMatriz().getN();j++) {
                        aux[i][j] = Global.getMatriz().get_Matriz()[i][j];
                    }
                }
                matriz.setMatriz(aux);
                Global.setMatriz(matriz);
                JOptionPane.showMessageDialog(null, "Almacen creado con exito!");
                AddRoutes ventana5 = new AddRoutes();
                this.dispose();
                }
        }
    }//GEN-LAST:event_AddStorageActionPerformed

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
            java.util.logging.Logger.getLogger(AddStorage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStorage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStorage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStorage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStorage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStorage;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField route;
    // End of variables declaration//GEN-END:variables
}
