/************
 
 Exercicio 021
Crie um vetor de 10 inteiros e inicialize-o com valores sequenciais (1, 2, 3, ..., 10). Em seguida, imprima todos os valores do vetor na tela.

 ***************/
 import java.util.Scanner;
 
 public class Rev22 {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int[] numeros = {10, 20, 30, 40, 50}; 
         int soma = 0;
         for (int i = 0; i < numeros.length; i++) {
             soma += numeros[i]; 
         }
         System.out.println("A soma de todos os elementos do vetor é: " + soma);
     }
 }