/******************************************************************************

4. Crie um algoritmo que leia uma matriz 3x3 e crie uma nova matriz que seja a matriz
transposta da primeira (troque as linhas por colunas)

*******************************************************************************/
import java.util.Scanner;
public class Exm07 {
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] transposta = new int[3][3];
      
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = ler.nextInt();
            }
        }
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
    
        System.out.println("Matriz original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
     
        System.out.println("Matriz transposta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposta[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
        