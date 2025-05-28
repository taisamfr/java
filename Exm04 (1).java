/******************************************************************************

1. Crie um programa que leia uma matriz 5x5. Em seguida, conte quantos números pares
existem na matriz. :)

*******************************************************************************/
import java.util.Scanner;
public class Exm04
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
		int [][] matriz = new int [5][5];
		int contadorPares = 0;
		
		System.out.println("Digite os números da matriz:");
		
		
		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Número [%d][%d]: ", i, j);
                matriz[i][j] = ler.nextInt();
            }
		}
		
		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 == 0) {
                    contadorPares++;
                }
            }
        }
        System.out.println("Quantidade de números pares: " + contadorPares);
	}
}

        

