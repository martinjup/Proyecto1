/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Clases.Global;
import Grafos.Archivos;
import Grafos.almacen;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author Windows
 */
public class AddRoutes extends javax.swing.JFrame {

    /**
     * Creates new form AddRoutes
     */
    
    int global_counter;
    
    public AddRoutes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.global_counter=0;
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
        jPanel3 = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Input = new javax.swing.JTextField();
        AddRoute = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setBackground(new java.awt.Color(153, 0, 0));
        Salir.setText("X");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel3.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 50, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Ingrese las rutas con los demas almacenes");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 38, 258, -1));

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("separando el nombre y el peso por coma. Ej: A,B,20");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 300, -1));

        Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputActionPerformed(evt);
            }
        });
        jPanel3.add(Input, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 88, 258, -1));

        AddRoute.setText("Agregar Ruta");
        AddRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRouteActionPerformed(evt);
            }
        });
        jPanel3.add(AddRoute, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 140, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed
    
    /*
    * @author León Serpa
    * Accion para añadir una ruta.
    */
    private void AddRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRouteActionPerformed
        // primero valida que lo ingresado tenga el formato adecuado.
        if ("".equals(Input.getText())){
            JOptionPane.showMessageDialog(null, "Por favor ingrese una ruta valida");
        } else {
            String route = Input.getText();
            if (Input.getText().contains(",") && Input.getText().split(",").length == 3){
            String[] aux = route.split(",");
            int[][] matriz_aux = Global.getMatriz().get_Matriz();
                if (Global.getLista_almacenes().nameExists(aux[0])) {
                    if (Global.getLista_almacenes().nameExists(aux[1])){
                        try{
                            //iguala el vertice de la matriz a la ruta escrita
                            matriz_aux[Global.getLista_almacenes().findPosition(aux[0])][Global.getLista_almacenes().findPosition(aux[1])] = Integer.parseInt(aux[2]);
                            Global.getMatriz().setMatriz(matriz_aux);

                            JOptionPane.showMessageDialog(null, "Ruta añadida con éxito!");
                            Input.setText("");
                            
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Error." + "\""+aux[2]+"\"" + " no es un numero");
                            System.out.println(Archivos.convert(aux[0], MenuPrincipal.Size()));
                            System.out.println(Archivos.convert(aux[1], MenuPrincipal.Size()));
                            Input.setText("");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay un almacen de nombre "+aux[1]);
                        Input.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay un almacen de nombre "+aux[0]);
                    Input.setText("");
                }
                
            }else {
                JOptionPane.showMessageDialog(null, "Error. Ingresar los nombres y el peso separado por comas.");
                Input.setText("");
            }
        }
    
    }//GEN-LAST:event_AddRouteActionPerformed

    private void InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputActionPerformed

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
            java.util.logging.Logger.getLogger(AddRoutes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRoutes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRoutes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRoutes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRoutes().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRoute;
    private javax.swing.JTextField Input;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}