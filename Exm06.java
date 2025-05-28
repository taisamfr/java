/******************************************************************************

3. Crie um algoritmo informe qual o maior e qual o menor elemento existente em uma matriz
6x3.

*******************************************************************************/
import java.util.Scanner;
public class Exm06 {
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int [][] matriz  = new int[6][3];

	    matriz[0][0] = 65;
        matriz[0][1] = 3;
        matriz[0][2] = 2;
     
        
        matriz[1][0] = 67;
        matriz[1][1] = 33;
        matriz[1][2] = 62;
      
        
        matriz[2][0] = 70;
        matriz[2][1] = 85;
        matriz[2][2] = 13;
       
        
        matriz[3][0] = 55;
        matriz[3][1] = 34;
        matriz[3][2] = 28;
        
        
        matriz[4][0] = 444;
        matriz[4][1] = 324;
        matriz[4][2] = 676;
        
        
        matriz[5][0] = 73;
        matriz[5][1] = 834;
        matriz[5][2] = 13;
       
       
       int maior = matriz[0][0];
       int menor = matriz[0][0];
        
        
       System.out.println("Números da matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("Maior número na matriz: " + maior);
        System.out.println("Menor número na matriz: " + menor);
    }
}