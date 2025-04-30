/******************************************************************************
Exercicio 006
Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9).

*******************************************************************************/
import java.util.Scanner;
public class Rev06
{
    public static void main (String [] arg){
     Scanner ler = new Scanner (System.in);
     int f, c;
     
     System.out.println("Informe a temperatura em Farenheit: ");
     f= ler.nextInt ();
     
     c=(5*(f-32)/9);
     
     System.out.println(" A temperatura em Celsius vai ser de: " + c);
     
    }
}