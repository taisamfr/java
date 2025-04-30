/******************************************************************************
Exercicio 009
Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total
*******************************************************************************/
import java.util.Scanner;
public class Rev09
{
    public static void main(String [] args){
        Scanner ler = new Scanner (System.in);
        double m,qntl, qntlt, v;
        System.out.println("Informe o  tamanho em metros da área a ser pintada: ");
        m= ler.nextDouble ();
        
        qntl= m/3;
        qntlt= qntl /18;
        v= qntlt*80;
        
        
        System.out.println(" A quantidade de litros utilizados será de: " +qntlt+ " E o valor será de: " +v);
        
    }
}