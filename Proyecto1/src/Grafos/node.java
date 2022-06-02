
package Grafos;

import java.awt.*;
import javax.swing.*;

public class node extends JPanel {

    private int x;
    private int y;
    private int d;
    private Color color;
    private String name;

    public node() {
        setPreferredSize(new Dimension(100, 100));
        setBackground(Color.white);
    }


    public void setValues(int x, int y, int d, Color color, String name) {
        this.x = x;
        this.y = y;
        this.d = d;
        this.color = color;
        this.name = name;
    }

    public void printValues(){
        System.out.println("x: " + x + " y: " + y + " d: " + d + " color: " + color + " name: " + name);
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        //Dado la lista de almacenes dibuja tantos circulos
        drawCircle(g, x, y, d);

    }

    public void drawCircle(Graphics cg, int xCenter, int yCenter, int r) {
        cg.drawOval(xCenter-r, yCenter-r, 2*r, 2*r);
    }

    public void draw(Graphics g){
        //Write the name of the node
        g.setColor(this.color);
        g.fillOval(this.x-(this.d/2), this.y-(this.d/2), this.d, this.d);
        Font font = new Font("Arial", Font.BOLD, 12);
        g.setFont(font);
        g.setColor(Color.black);
        g.drawString(name, x, y);

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getD() {
        return d;
    }

    public char convert(int index) {
        //Funcion que sirve para dado un indice devuelve una letra
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return abc.charAt(index);
       
        
    }

} 


