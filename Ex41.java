/*
41 - O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo
que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a
balança já desconte o peso do prato.  
*/

import java.util.Scanner;

public class Ex41  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual o peso do prato em quilos? ");
        double peso = sc.nextDouble();
        
        double precoPorKg = 12.00;
        double valorAPagar = peso * precoPorKg;
        
        System.out.printf("O valor a pagar é: R$%.2f%n", valorAPagar);
    }
}
