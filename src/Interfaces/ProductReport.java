/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Clases.Function;
/**
 *
 * @author Windows
 */
public class ProductReport extends javax.swing.JFrame {

    Function func = new Function();
    public ProductReport() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        recorridoa = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        recorridop = new javax.swing.JTextArea();
        recorrido_anchura = new javax.swing.JButton();
        recorrido_profundidad = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recorridoa.setBackground(new java.awt.Color(153, 255, 255));
        recorridoa.setColumns(20);
        recorridoa.setForeground(new java.awt.Color(51, 51, 51));
        recorridoa.setRows(5);
        jScrollPane1.setViewportView(recorridoa);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 290, 280));

        recorridop.setBackground(new java.awt.Color(153, 255, 255));
        recorridop.setColumns(20);
        recorridop.setForeground(new java.awt.Color(51, 51, 51));
        recorridop.setRows(5);
        jScrollPane2.setViewportView(recorridop);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 280));

        recorrido_anchura.setBackground(new java.awt.Color(255, 153, 153));
        recorrido_anchura.setForeground(new java.awt.Color(255, 0, 0));
        recorrido_anchura.setText("RECORRIDO POR ANCHURA");
        recorrido_anchura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recorrido_anchuraActionPerformed(evt);
            }
        });
        jPanel2.add(recorrido_anchura, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 230, 40));

        recorrido_profundidad.setBackground(new java.awt.Color(255, 153, 153));
        recorrido_profundidad.setForeground(new java.awt.Color(255, 0, 0));
        recorrido_profundidad.setText("RECORRIDO EN PROFUNDIDAD");
        recorrido_profundidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recorrido_profundidadActionPerformed(evt);
            }
        });
        jPanel2.add(recorrido_profundidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 230, 40));

        Salir.setBackground(new java.awt.Color(204, 0, 51));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel2.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Iguala a el TextArea a un String que recorre la matriz de adyacencia en profundidad
    private void recorrido_profundidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recorrido_profundidadActionPerformed
        recorridop.setText(func.recorrido_en_profundidad());
    }//GEN-LAST:event_recorrido_profundidadActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    //Iguala a el TextArea a un String que recorre la matriz de adyacencia por anchura
    private void recorrido_anchuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recorrido_anchuraActionPerformed
        recorridoa.setText(func.recorrido_por_anchura());
    }//GEN-LAST:event_recorrido_anchuraActionPerformed

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
            java.util.logging.Logger.getLogger(ProductReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton recorrido_anchura;
    private javax.swing.JButton recorrido_profundidad;
    private javax.swing.JTextArea recorridoa;
    private javax.swing.JTextArea recorridop;
    // End of variables declaration//GEN-END:variables
}
