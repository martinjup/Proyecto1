
package Grafos;

public class Rutas {

    private int[][] adj;

    public Rutas(int n) {
        this.adj = new int[n][n];
    }

    //Is a direccional graph

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



}