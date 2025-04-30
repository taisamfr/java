/******************************************************************************
Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

*******************************************************************************/
import java.util.Scanner;
public class Rev07
{
    public static void main (String [] args){
        Scanner ler= new Scanner (System.in);
        double h, p;
        
        System.out.println(" Informe a sua altura: ");
        h= ler.nextDouble ();
        
        p =(72.7*h) -58;
        
        System.out.println("O peso ideal para a sua altura é:  " + p);
        
    }
}