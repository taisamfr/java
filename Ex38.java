/*
38 -  A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado). Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular os dados solicitados.

*/

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos pães franceses foram vendidos? ");
        int paes = sc.nextInt();
        
        System.out.print("Quantas broas foram vendidas? ");
        int broas = sc.nextInt();
        
        double precoPao = 0.12;
        double precoBroa = 1.50;
        
        double totalArrecadado = (paes * precoPao) + (broas * precoBroa);
        double poupanca = totalArrecadado * 0.10;
        
        System.out.printf("Arrecadação total: R$%.2f%n", totalArrecadado);
        System.out.printf("Valor para poupança (10%%): R$%.2f%n", poupanca);
    }
}
