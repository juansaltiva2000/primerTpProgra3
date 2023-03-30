package principal;

import java.util.Arrays;
import java.util.Scanner;

public class juego {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creo una matriz de 4x4
        int[][] matriz = new int[4][4];
        // Creo array con las soluciones buscadas
        int [] solucionFila = {4,4,4,4};
        int [] solucionColumna = {4,4,4,4};

        // Solicitar la entrada del usuario para cada celda
        // esto es manual pero mas adelante tiene que ser con la entrada de cada boton
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el valor para la celda [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Verificar la suma de cada fila y columna
        int[] sumasFilas = new int[matriz.length];
        int[] sumasColumnas = new int[matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumasFilas[i] += matriz[i][j];
                sumasColumnas[j] += matriz[i][j];
            }
        }
        // Imprimir la solucion buscada en filas
        System.out.print("Suma deseada Filas: ");
        for (int i = 0; i < solucionFila.length; i++) {
            System.out.print(solucionFila[i] + " ");
        }
        System.out.println();
        
     // Imprimir la solucion buscada en columnas
        System.out.print("Suma deseada Columnas: ");
        for (int i = 0; i < solucionColumna.length; i++) {
            System.out.print(solucionColumna[i] + " ");
        }
        System.out.println();
        // Imprimir la suma de cada fila
        System.out.print("Sumas de filas: ");
        for (int i = 0; i < sumasFilas.length; i++) {
            System.out.print(sumasFilas[i] + " ");
        }
        System.out.println();

        // Imprimir la suma de cada columna
        System.out.print("Sumas de columnas: ");
        for (int j = 0; j < sumasColumnas.length; j++) {
            System.out.print(sumasColumnas[j] + " ");
        }
        System.out.println();
        //Verificar si gano el juego
        if ( Arrays.equals(sumasFilas, solucionFila) && Arrays.equals(sumasColumnas, solucionColumna))
        { {
            System.out.print( "Felicidades has ganado el juego! ");
        }
        System.out.println();}
        else{
            
        {
            System.out.print( "Has perdido! ");
        }
        System.out.println();}
        input.close();
    }
}
