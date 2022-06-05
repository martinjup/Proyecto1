
package Interfaces;

import Clases.Global;

/**
 *
 * @Creado por: Martin Urdaneta
 */
public class ManageStorage extends javax.swing.JFrame {

    /**
     * Crea interface de Gestion de Almacen
     */
    public ManageStorage() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    }
    
    /*
    
    Se inicializan variables globales dentro de la interface para comunicacion
    entre botones
 
 */
    String almacen = "";
    String producto = "";
    Integer posicion = 0;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DisplayAlmacenes = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        DisplayInventarios = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        InputAlmacen = new javax.swing.JTextField();
        InputProducto = new javax.swing.JTextField();
        InputCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DisplayAlmacenes.setColumns(20);
        DisplayAlmacenes.setRows(5);
        jScrollPane2.setViewportView(DisplayAlmacenes);
        Integer nalmacenes = Global.getLista_almacenes().getLength();

        Integer i = 0;

        String almacenes = "";

        while (i < nalmacenes ){

            almacenes += Global.getLista_almacenes().findName(i);
            almacenes += "\n";

            i++;

        }
        DisplayAlmacenes.setText(almacenes);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 220, 200));

        DisplayInventarios.setColumns(20);
        DisplayInventarios.setRows(5);
        jScrollPane3.setViewportView(DisplayInventarios);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 220, 200));

        jLabel1.setText("Almacenes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setText("Inventario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        InputAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputAlmacenActionPerformed(evt);
            }
        });
        jPanel1.add(InputAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 260, 220, -1));

        InputProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputProductoActionPerformed(evt);
            }
        });
        jPanel1.add(InputProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 270, 210, -1));

        InputCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(InputCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 330, 210, -1));

        jLabel3.setText("Producto (Presione enter)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        jLabel4.setText("Cantidad (Presione enter)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        jLabel5.setText("Elija Almacen");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Espacio de texto para recibir el nombre del producto
    
    private void InputProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputProductoActionPerformed
        
        producto = InputProducto.getText();
    }//GEN-LAST:event_InputProductoActionPerformed

    //Espacio de texto para recibir la cantidad del producto y visualizar el inventario nuevo
    
    private void InputCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputCantidadActionPerformed
        

        String inventario = (Global.getLista_almacenes().findNodo(posicion).getListaItems());
        String cantidad = InputCantidad.getText();
        inventario += "\n" + producto + "," + cantidad;
        DisplayInventarios.setText(inventario);
        
       
    }//GEN-LAST:event_InputCantidadActionPerformed

    //Espacio de texto para recibir el almacen sobre cual se va a trabajar
    
    private void InputAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputAlmacenActionPerformed

        
        almacen = InputAlmacen.getText();
        posicion = Global.getLista_almacenes().findPosition(almacen);
        DisplayInventarios.setText(Global.getLista_almacenes().findNodo(posicion).getListaItems());
        
        
    }//GEN-LAST:event_InputAlmacenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageStorage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DisplayAlmacenes;
    private javax.swing.JTextArea DisplayInventarios;
    private javax.swing.JTextField InputAlmacen;
    private javax.swing.JTextField InputCantidad;
    private javax.swing.JTextField InputProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
