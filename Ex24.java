/******************************************************************************

Soma de números de 1 a 10 = 1+2+3+4+5...+10

*******************************************************************************/
public class Ex24
{
	public static void main(String[] args) {
	    int soma = 0;
	    int numero = 1;
	    
	    while (numero <= 10) {
	        soma += numero;
	        numero++;
	    }
	    System.out.println("A soma do números de 1 a 10 é: " + soma);
	}
}