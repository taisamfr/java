/*

42 - Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a
quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
informe quanto será o valor arrecadado.
  
*/

import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas camisetas pequenas foram vendidas? ");
        int pequenas = sc.nextInt();
        
        System.out.print("Quantas camisetas médias foram vendidas? ");
        int media = sc.nextInt();
        
        System.out.print("Quantas camisetas grandes foram vendidas? ");
        int grandes = sc.nextInt();
        
        int precoPequena = 10;
        int precoMedia = 12;
        int precoGrande = 15;
        
        int totalArrecadado = (pequenas * precoPequena) + (media * precoMedia) + (grandes * precoGrande);
        
        System.out.printf("Valor arrecadado: R$%d%n", totalArrecadado);
    }
}
