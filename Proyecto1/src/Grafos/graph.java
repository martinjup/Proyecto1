
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

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        //Dado la lista de almacenes dibuja tantos circulos
        for (int i = 0; i < nodes.size(); i++) {
            for (int j = 0; j < nodes.size(); j++) {
                if (adj.getWeight(i, j) != 0) {
                    g.drawString(adj.getWeight(i, j)+"",(nodes.get(i).getX()+ nodes.get(j).getX()-35)/2,(nodes.get(i).getY()+ nodes.get(j).getY()-35)/2 );
                    g.drawLine(nodes.get(i).getX(), nodes.get(i).getY(), nodes.get(j).getX(), nodes.get(j).getY());
                    int centerx = (nodes.get(i).getX() + nodes.get(j).getX()) / 2;
                    int centery = (nodes.get(i).getY() + nodes.get(j).getY()) / 2;
                    double normalx = (nodes.get(i).getX() - nodes.get(j).getX()) ;
                    double normaly = (nodes.get(i).getY() - nodes.get(j).getY()) ;
                    double distance = Math.sqrt(Math.pow(normalx, 2) + Math.pow(normaly, 2));
                    normalx = normalx / distance;
                    normaly = normaly / distance;
                    int endx1 = (int) (centerx + (normalx+normaly) * (15));
                    int endy1 = (int) (centery + (normaly-normalx) * (15));
                    g.drawLine(centerx, centery, endx1,endy1);
                    int endx2 = (int) (centerx + (normalx-normaly) * (15));
                    int endy2 = (int) (centery + (normaly+normalx) * (15));
                    g.drawLine(centerx, centery, endx2,endy2);
                    
                }
            }
        }
        for(int i = 0; i < nodes.size(); i++){
            nodes.get(i).draw(g);        
        }
    }
}
