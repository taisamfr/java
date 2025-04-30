/******************************************************************************
Exercicio 008
João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
*******************************************************************************/
import java.util.Scanner;
public class Rev08
{
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);
        double p, e, m;
        
        System.out.println("Informe o peso do peixe: ");
        p= ler.nextDouble ();
        
        e= p*50;
        m= e*4;
        
        if(p>50)
        System.out.println("O excesso do peixe é de :" + e +  "E a multa será de: "+ m);
        
        else
        System.out.println(" O peixe está no peso estabelecido pelo regulamento de pesca de SP");
    }
}