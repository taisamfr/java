/******************************************************************************
Exercicio 002
Faça um Programa que peça dois números e imprima a soma.
*******************************************************************************/
import java.util.Scanner;
public class Rev02
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int n1, n2, soma ;
	
  System.out.println("Informe o primeiro número:");
 n1 = ler.nextInt();
 
 System.out.println("Infome o segundo número:");
 n2= ler.nextInt();
 
 soma = n1 + n2;
 
 System.out.println("A soma dos dois números é igual:" + soma);
 
	}
}