/******************************************************************************
Exercicio 010
Faça um Programa que peça dois números e imprima o maior deles.
*******************************************************************************/
import java.util.Scanner;
public class Rev10
{
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);
        double n1, n2;
        
        System.out.println("Entre com o primeiro número: ");
        n1= ler.nextDouble ();
        
        System.out.println("Entre com o segundo número: ");
        n2= ler.nextDouble ();
        
        if(n1>n2)
        System.out.println(" O primeiro número  " + n1+ " é o maior");
        
        else
        System.out.println("O segundo número  " +n2+ " é o maior");
        
    }
}