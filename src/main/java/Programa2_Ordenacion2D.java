import java.util.Arrays;

public class Programa2_Ordenacion2D {
    
    public static void main(String[] args) {
        // Declarar una matriz 3x3 de enteros
        int[][] matriz = {
            {35, 13, 68},
            {66, 5, 71},
            {46, 83, 4}
        };
        
        // Mostrar la matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);
        System.out.println();
        
        // Crear una copia de la matriz para mantener la original intacta
        int[][] matrizCopia = copiarMatriz(matriz);
        
        // Ordenar la fila 1 (índice 1) en orden ascendente
        int filaAOrdenar = 1;
        System.out.println("Ordenando la fila " + filaAOrdenar + " en orden ascendente...");
        ordenarFila(matrizCopia, filaAOrdenar);
        
        // Mostrar la matriz con la fila ordenada
        System.out.println("\nMatriz con la fila " + filaAOrdenar + " ordenada:");
        mostrarMatriz(matrizCopia);
        System.out.println();
        
        // Demostrar ordenación con diferentes filas
        System.out.println("=== Demostrando ordenación de diferentes filas ===");
        
        for (int fila = 0; fila < matriz.length; fila++) {
            int[][] nuevaCopia = copiarMatriz(matriz);
            System.out.println("\nMatriz original:");
            mostrarMatriz(nuevaCopia);
            
            ordenarFila(nuevaCopia, fila);
            System.out.println("Matriz con fila " + fila + " ordenada:");
            mostrarMatriz(nuevaCopia);
        }
    }
    
    /**
     * Ordena una fila específica de la matriz en orden ascendente usando Arrays.sort
     * @param matriz La matriz a modificar
     * @param fila El índice de la fila a ordenar
     */
    public static void ordenarFila(int[][] matriz, int fila) {
        if (fila >= 0 && fila < matriz.length) {
            Arrays.sort(matriz[fila]);
        } else {
            System.out.println("Error: Índice de fila fuera de rango.");
        }
    }
    
    /**
     * Ordena una fila específica usando Bubble Sort (implementación alternativa)
     * @param matriz La matriz a modificar
     * @param fila El índice de la fila a ordenar
     */
    public static void ordenarFilaBubbleSort(int[][] matriz, int fila) {
        if (fila < 0 || fila >= matriz.length) {
            System.out.println("Error: Índice de fila fuera de rango.");
            return;
        }
        
        int[] filaArray = matriz[fila];
        int n = filaArray.length;
        
        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (filaArray[j] > filaArray[j + 1]) {
                    // Intercambiar elementos
                    int temp = filaArray[j];
                    filaArray[j] = filaArray[j + 1];
                    filaArray[j + 1] = temp;
                }
            }
        }
    }
    
    /**
     * Crea una copia profunda de la matriz
     * @param original La matriz original
     * @return Una nueva matriz con los mismos valores
     */
    public static int[][] copiarMatriz(int[][] original) {
        int[][] copia = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i].clone();
        }
        return copia;
    }
    
    /**
     * Método auxiliar para mostrar la matriz en consola
     * @param matriz La matriz a mostrar
     */
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}

  

