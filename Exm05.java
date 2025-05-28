/******************************************************************************

2. Crie um algoritmo que leia uma matriz 3x3 e calcule a soma dos valores das colunas da
matriz.

*******************************************************************************/
import java.util.Scanner;
public class Exm05 {
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int [][] matriz  = new int[3][3];
	    int [] soma = new int[3];
	    
	    System.out.println("Digite os números da matriz: ");
	    for (int i = 0; i < 3; i++) {
	        for (int l = 0; l < 3; l++) {
	            System.out.printf("Elemento [%d][%d]: ", i, l);
                matriz[i][l] = ler.nextInt();
	        }
	    }
	    
	    for (int l = 0; l < 3; l++) {
	        for (int i = 0; i < 3; i++) {
	            soma[l] += matriz[i][l];
	        }
	    }
	      System.out.println("Soma dos valores das colunas:");
        for (int l = 0; l < 3; l++) {
            System.out.printf("Coluna %d: %d%n", l + 1, soma[l]);
        }
	}
}