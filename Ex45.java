/*

45 - A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de
queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou
presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em
que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em
quilos) de queijo, presunto e carne necessários para compra. 
*/

import java.util.Scanner;

public class Ex45 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos sanduíches você deseja fazer? ");
        int qtdSanduiches = sc.nextInt();
        
        double queijo = qtdSanduiches * 2 * 0.05;  // 2 fatias de queijo, cada uma com 50g (0.05kg)
        double presunto = qtdSanduiches * 1 * 0.05;  // 1 fatia de presunto com 50g
        double carne = qtdSanduiches * 1 * 0.1;  // 1 rodela de hambúrguer com 100g (0.1kg)
        
        System.out.printf("Você precisará de %.2f kg de queijo, %.2f kg de presunto e %.2f kg de carne.%n", queijo, presunto, carne);
    }
}
