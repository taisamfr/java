/*******************************************************************************
Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

*******************************************************************************/
import java.util.Scanner;
public class Rev05
{
    public static void main (String [] arg){
        Scanner ler = new Scanner (System.in);
        double vh, ht, s;
        
        System.out.println("Informe o quanto você ganha por horas: ");
        vh= ler.nextInt ();
        
        System.out.println("Informe a quantidade de horas que você trabalha: ");
        ht= ler.nextInt ();
        
        s= vh*ht;
        
        System.out.println("O seu salário vai será: " + s);
    }
}