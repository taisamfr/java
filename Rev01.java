/******************************************************************************
Exercicio 001
Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
*******************************************************************************/
import java.util.Scanner;
public class Rev01

{
	public static void main(String[] args) {
	Scanner ler =  new Scanner (System.in);
	int numero;
	
	System.out.println("Informe um número");
	numero = ler.nextInt();
	
	System.out.println("O número informado foi:"+ numero);
	
	
	}
}
