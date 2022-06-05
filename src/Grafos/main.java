
package Grafos;

import java.util.ArrayList;
import java.awt.*;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class main {
    

    public static void main(String args[]) {
        
        /**
         * @author Marting Ojanguren
         */
        //Crear un Frame
        JFrame frame = new JFrame("Rutas");
        
        //Creo una instancia de la clase
        Archivos fh = new Archivos();
        //Creo un array para poder tener la lista de almacenes y la matriz de adyacencia
        // ArrayList<Object> retorno = fh.readFile("ebay.txt");
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(frame);

        if(returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " +
            chooser.getSelectedFile().getName());

            ArrayList<Object> retorno = fh.readFile(chooser.getSelectedFile().getAbsolutePath());
            System.out.println(retorno.get(0));
            //el primer elemento de retorno es la lista de almacenes y el segundo es la matriz de adyacencia
            ArrayList<Object> almacenes = (ArrayList) retorno.get(0);
            Rutas Matrix = (Rutas) retorno.get(1);
            //Para fines ilustrativos imprimo la lista de almacenes y la matriz de adyacencia
            // Matrix.print();
            ArrayList<node> nodos = new ArrayList<>();
            ArrayList<Color> colores = new ArrayList<>();
            
            frame.setVisible(true);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            for(int i = 0; i < almacenes.size(); i++){
                colores.add(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
            }



            for(int i=0; i<almacenes.size();i++){
                node vertex = new node();
                //Se distrbuyen los vertices con la funcion seno, la cantidad de almacenes e i
                String aux = Character.toString(vertex.convert(i));
                
                vertex.setValues( (int) (250+ 200*(Math.cos((2*Math.PI/almacenes.size())*i) )),(int) (250+ 200*(Math.sin((2*Math.PI/almacenes.size())*i))), 50, colores.get(i),aux);
                nodos.add(vertex);
                
            }

            graph g = new graph(nodos,Matrix);

            frame.add(g);
            }

    }


}