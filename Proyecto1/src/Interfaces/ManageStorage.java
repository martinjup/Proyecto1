
package Interfaces;

import Clases.Global;
import Clases.ListaInventario;
import Clases.NodoAlmacen;
import Clases.NodoItem;
import javax.swing.JOptionPane;

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
    NodoAlmacen nodo;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Cantidad = new javax.swing.JTextField();
        NombreProducto = new javax.swing.JTextField();
        NombreAlmacen = new javax.swing.JTextField();
        Elegir = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DisplayAlmacenes.setBackground(new java.awt.Color(153, 255, 204));
        DisplayAlmacenes.setColumns(20);
        DisplayAlmacenes.setForeground(new java.awt.Color(0, 0, 0));
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

        DisplayInventarios.setBackground(new java.awt.Color(153, 255, 255));
        DisplayInventarios.setColumns(20);
        DisplayInventarios.setForeground(new java.awt.Color(0, 0, 0));
        DisplayInventarios.setRows(5);
        jScrollPane3.setViewportView(DisplayInventarios);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 220, 200));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Almacenes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Inventario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Ingrese el producto (Importan las mayusculas)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Ingrese la cantidad del producto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Elija Almacen");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        Agregar.setBackground(new java.awt.Color(255, 153, 153));
        Agregar.setForeground(new java.awt.Color(0, 0, 0));
        Agregar.setText("Agregar Producto");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 130, -1));

        Eliminar.setBackground(new java.awt.Color(255, 153, 153));
        Eliminar.setForeground(new java.awt.Color(0, 0, 0));
        Eliminar.setText("Eliminar Producto");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 130, -1));
        jPanel1.add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 220, -1));

        NombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreProductoActionPerformed(evt);
            }
        });
        jPanel1.add(NombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 220, -1));
        jPanel1.add(NombreAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 220, -1));

        Elegir.setBackground(new java.awt.Color(255, 153, 153));
        Elegir.setForeground(new java.awt.Color(0, 0, 0));
        Elegir.setText("Elegir");
        Elegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElegirActionPerformed(evt);
            }
        });
        jPanel1.add(Elegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreProductoActionPerformed


    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        String nombre = NombreProducto.getText();
        String cantidad = Cantidad.getText();
        NodoItem items;
        int nro;
        //Validaciones para que no haya errores en el cambio
        if (!"".equals(nombre)) {
            if (nodo.getListaItem() == null) {
                ListaInventario lista = new ListaInventario();
                try{
                    nro = Integer.parseInt(cantidad);
                    if(nro>0) {
                        String[] item = new String[2];
                        item[0] = nombre;
                        item[1] = cantidad;
                        lista.InsertarFinal(item);
                        nodo.setListaItems(lista);
                        JOptionPane.showMessageDialog(null, "Items ingresados con exito");
                        DisplayInventarios.setText("");
                    } else{
                        JOptionPane.showMessageDialog(null, "Por favor ingrese un numero positivo");
                    }
                    
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Por favor ingrese una cantidad valida");
                }
            } else{
        if (nodo.getListaItem().ProductExists(nombre)) {
            String[] item;
            item = nodo.getListaItem().findProduct(nombre).getItem();
            try{ 
                //convierte al item del array en un numero, lo suma con la cantidad y lo cambia nuevamente a string
                nro = Integer.parseInt(cantidad);
                if(nro>0){
                item[1] = Integer.toString(Integer.parseInt(item[1])+nro);
                items = nodo.getListaItem().findProduct(nombre);
                //cambia el item en la lista global
                items.setItems(item);
                JOptionPane.showMessageDialog(null, "Items agregados con exito!");
                DisplayInventarios.setText("");
                
                } else{
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un numero positivo");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una cantidad valida");
            }
            //Si el producto escrito no existe, agrega uno nuevo a la lista
        } else {
            String[] item = new String[2];
            try{ 
                nro = Integer.parseInt(cantidad);
                item[0] = nombre;
                item[1] = Integer.toString(nro);
                nodo.getListaItem().InsertarFinal(item);
                JOptionPane.showMessageDialog(null, "Items agregados con exito!");
                DisplayInventarios.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una cantidad valida");
                
            }
        }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Por favor ingrese un nombre");
        }
    }//GEN-LAST:event_AgregarActionPerformed

    //Elige el almacen y escribe sus items en el display
    private void ElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElegirActionPerformed
        almacen = NombreAlmacen.getText();
        if (Global.getLista_almacenes().nameExists(almacen)) {
            nodo = Global.getLista_almacenes().findNodo(Global.getLista_almacenes().findPosition(almacen));
            DisplayInventarios.setText(nodo.getListaItems());
            NombreAlmacen.setText("");
            
        } else {
            JOptionPane.showMessageDialog(null, "No existe un almacen con ese nombre");
            NombreAlmacen.setText("");
        }
    }//GEN-LAST:event_ElegirActionPerformed
    
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        String nombre = NombreProducto.getText();
        String cantidad = Cantidad.getText();
        NodoItem items;
        int nro;
        //Validaciones para que no haya errores en el cambio
        if (!"".equals(nombre)) {
            if (nodo.getListaItem() == null) {
                JOptionPane.showMessageDialog(null, "Este Almacen no tiene inventario");
            } else{
        if (nodo.getListaItem().ProductExists(nombre)) {
            String[] item;
            
            item = nodo.getListaItem().findProduct(nombre).getItem();
            try{ 
                nro = Integer.parseInt(cantidad);
                if(nro > 0){
                //Si la cantidad ingresada es menos que la cantidad des items, lo resta
                if (nro < Integer.parseInt(item[1])){
                item[1] = Integer.toString(Integer.parseInt(item[1])-nro);
                items = nodo.getListaItem().findProduct(nombre);
                items.setItems(item);
                JOptionPane.showMessageDialog(null, "Items eliminados con exito!");
                DisplayInventarios.setText("");
                }else{
                    //Si la cantidad ingresada es mayor que la cantidad de items, elimina el item completamente
                    nodo.getListaItem().DeleteProduct(nodo.getListaItem().findPosition(item[0]));
                    DisplayInventarios.setText("");
                    JOptionPane.showMessageDialog(null, "Items eliminados con exito!");
                }
                } else{
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un numero positivo");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una cantidad valida");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existe ese producto");
        }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Por favor ingrese un nombre");
        }
    }//GEN-LAST:event_EliminarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageStorage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextArea DisplayAlmacenes;
    private javax.swing.JTextArea DisplayInventarios;
    private javax.swing.JButton Elegir;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField NombreAlmacen;
    private javax.swing.JTextField NombreProducto;
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
