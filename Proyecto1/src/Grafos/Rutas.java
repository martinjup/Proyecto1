
package Grafos;

public class Rutas {
    
    private static int[][] adj;

    public Rutas(int n) {
        this.adj = new int[n][n];
    }

    //es un grafo direccional

    public void addEdge(int v, int w, int weight) {
        this.adj[v][w] = weight;
    }

    public void print() {
        for (int i = 0; i < this.adj.length; i++) {
            for (int j = 0; j < this.adj.length; j++) {
                System.out.print(this.adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void deleteEdge(int v, int w) {
        this.adj[v][w] = 0;
    }

    public int getWeight(int v, int w) {
        return this.adj[v][w];
    }

    public int getSize() {
        return this.adj.length;
    }


    public static int[][] getMatrix(){
        return Rutas.adj;
    }

    //Cuando se agrega un nuevo almacen se incrementa la dimension de la matriz
    public void addNode() {
        int[][] newAdj = new int[this.adj.length + 1][this.adj.length + 1];
        for (int i = 0; i < this.adj.length; i++) {
            for (int j = 0; j < this.adj.length; j++) {
                newAdj[i][j] = this.adj[i][j];
            }
        }
        this.adj = newAdj;
    }
}