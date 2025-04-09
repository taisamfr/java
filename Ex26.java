/******************************************************************************

26. Faça um programa, utilizando while, que mostre na tela de 0 até N, em que N é o limite inserido pelo usuário.

*******************************************************************************/
import java.util.Scanner;
public class Ex26
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int numero = 0;
	    
	    System.out.println("Selecione um número: ");
	    int n = scanner.nextInt();
	    
	    while (numero <= n) {
	        System.out.println(numero);
	        numero++;
	    }
	}
}
