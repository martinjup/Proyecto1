
package Clases;


public class MatrizAdyacencia {
    int n;
    int[][] matriz;
    
    /*
    @author León Serpa
    @params crea una matriz de n x n 

    */
    public MatrizAdyacencia(int n) {
        this.n = n;
        this.matriz = new int[n][n];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[][] get_Matriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    
    /*
    @author León Serpa
    se le da una coordenada y la cambia.
    */
    public void AñadirRuta(int i, int j, int peso) {
        this.matriz[i][j] = peso;
    }
    
    
    /*
    @author León Serpa
    @params se le indica el numero de la fila
    @returns revisa si esa fila esta vacia
    */
    
    public String ImprimirGrafo(){
        String StrMatriz = "";
        for(int i =0; i<n;i++){
            for (int j = 0; j<n;j++){
                StrMatriz += matriz[i][j]+"      |       ";
            }
            StrMatriz+="\n";
        }
        return StrMatriz;
    }
    
    /*
    @author León Serpa
    Cuando se agrega un almacen, se crea una nueva matriz de adyacencia de n+1,
    y se le igualan los vertices anteriores
    */
    public void añadirAlmacen(){
        int[][] temp = this.matriz;
        int[][] nueva_matriz = new int[n+1][n+1];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                nueva_matriz[i][j] = temp[i][j];
            }
        }
        
    }
    /*
    @author León Serpa
    @returns devuelve un string con las rutas en el formato inicial.
    */
    public String ImprimirRutas(){
        String Str = "";
        for (int i = 0; i<n;i++) {
            for (int j = 0; j<n;j++) {
                if (matriz[i][j] != 0) {
                    Str += Global.getLista_almacenes().findName(i)+","+ Global.getLista_almacenes().findName(j) + "," + Integer.toString(matriz[i][j]) +"\n";
                }
        }
        }
        return Str;
    }
    
    /*
    @author León Serpa
    Vacia una fila completa de la matriz
    */
    public void VaciarFila(int x) {
        for (int i = 0; i<n;i++){
            matriz[x][i] = 0;
        }
    }
    /*
    @author León Serpa
    Vacia una columna completa de la matriz
    */
    public void VaciarColumna(int x) {
        for (int i = 0; i<n;i++){
            matriz[i][x] = 0;
        }
    }
    /*
    @author León Serpa
    @returns revisa si la matriz esta vacia
    */
    public boolean EstaVacia(){
        boolean vacia = true;
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                if(matriz[i][j] == 0){
                    vacia = false;
                }
        }
        }
        return vacia;
    }
    /*
    @author León Serpa
    @params se le indica el numero de la fila
    @returns revisa si esa fila esta vacia
    */
    public boolean FilaVacia(int fila){
        boolean vacia = true;
        for (int j = 0; j<n; j++) {
            if (matriz[fila][j] != 0){
                vacia = false;
            }
        }
        return vacia;
    }
    
    /*
    @author León Serpa
    @params se le indica el numero de la columna
    @returns revisa si esa columna esta vacia
    */
    
    public boolean ColumnaVacia(int columna){
        boolean vacia = true;
        for (int i = 0; i<n; i++) {
            if (matriz[i][columna] != 0){
                vacia = false;
            }
        }
        return vacia;
    }
    
    /*
    @author León Serpa
    se le da una coordenada y la cambia.
    */
    public void setNodo(int i, int j, int peso) {
        matriz[i][j] = peso;
    }
}
