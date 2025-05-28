/******************************************************************************

5. Desenvolva um programa que leia duas matrizes 5x2 e crie uma terceira matriz também 5x2
com o valor da soma dos elementos de mesmo índice.

*******************************************************************************/
import java.util.Scanner;
public class Exm08 {
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
       int[][] matriz1 = new int[5][2];
        int[][] matriz2 = new int[5][2];
        int[][] matrizSoma = new int[5][2];

        System.out.println("Digite os elementos da primeira matriz 5x2:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz1[i][j] = ler.nextInt();
            }
        }
        System.out.println("Digite os elementos da segunda matriz 5x2:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz2[i][j] = ler.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("Matriz resultante da soma:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizSoma[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
        