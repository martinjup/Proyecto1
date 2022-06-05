
package Grafos;
import java.util.ArrayList;
import java.awt.*;

import javax.swing.JPanel;

public class graph extends JPanel {
 
    private ArrayList<node> nodes;
    private Rutas adj;

    public graph(ArrayList<node> almacenes, Rutas Matrix) {
        this.nodes = almacenes;
        this.adj = Matrix;
    }
    /**
     * @author Martin Ojanguren
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        //Dado la lista de almacenes dibuja tantos circulos
        for (int i = 0; i < nodes.size(); i++) {
            for (int j = 0; j < nodes.size(); j++) {
                if (adj.getWeight(i, j) != 0) {
                    //Dibuja la distancia (peso) entre dos almacenes (vertices)
                    g.drawString(adj.getWeight(i, j) + "", (nodes.get(i).getX() + nodes.get(j).getX()-35) / 2, (nodes.get(i).getY() + nodes.get(j).getY()-35) / 2);
                    //Dibuja La linea entre dos almacenes (vertices)
                    g.drawLine(nodes.get(i).getX(), nodes.get(i).getY(), nodes.get(j).getX(), nodes.get(j).getY());
                    //Obtengo la distancia media en el eje de las x y el eje de las y
                    int centerx = (nodes.get(i).getX() + nodes.get(j).getX()) / 2;
                    int centery = (nodes.get(i).getY() + nodes.get(j).getY()) / 2;
                    //Calculando el vector normal de x e y para poder posicionarlo a 45 grados de la linea que une los vertices
                    double normalx = (nodes.get(i).getX() - nodes.get(j).getX()) ;
                    double normaly = (nodes.get(i).getY() - nodes.get(j).getY()) ;
                    //Calculando la distancia entre los dos vertices
                    double distance = Math.sqrt(Math.pow(normalx, 2) + Math.pow(normaly, 2));
                    normalx = normalx / distance;
                    normaly = normaly / distance;
                    //Colocando la primera linea que esta a 45 grados con respecto a la linea original
                    int endx1 = (int) (centerx + (normalx+normaly) * (15));
                    int endy1 = (int) (centery + (normaly-normalx) * (15));
                    g.drawLine(centerx, centery, endx1,endy1);
                    //Colocando la segunda linea que esta a 45 grados con respecto a la linea original
                    int endx2 = (int) (centerx + (normalx-normaly) * (15));
                    int endy2 = (int) (centery + (normaly+normalx) * (15));
                    g.drawLine(centerx, centery, endx2,endy2);
                    
                }
            }
        }
        //Por ultimo dibujo los vertices del grafo
        for(int i = 0; i < nodes.size(); i++){
            nodes.get(i).draw(g);        
        }
    }
}
