
package Clases;


public class MatrizAdyacencia {
    int n;
    int[][] matriz;
    
    public MatrizAdyacencia(int n) {
        this.n = n;
        this.matriz = new int[n][n];
    }
    
    public void AñadirRuta(int i, int j, int peso) {
        this.matriz[i][j] = peso;
    }
    public String ImprimirGrafo(){
        String StrMatriz = "";
        for(int i =0; i<n;i++){
            for (int j = 0; j<n;j++){
                StrMatriz += matriz[i][j]+"        ";
            }
            StrMatriz+="\n";
        }
        return StrMatriz;
    }
    
    public void añadirAlmacen(){
        int[][] temp = this.matriz;
        int[][] nueva_matriz = new int[n+1][n+1];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                nueva_matriz[i][j] = temp[i][j];
            }
        }
        
    }
}
