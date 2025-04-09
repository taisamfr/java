/*


40 -  Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o
preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no
tanque.
*/

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual o preço do litro da gasolina? R$");
        double precoLitro = sc.nextDouble();
        
        System.out.print("Quanto você pagou pela gasolina? R$");
        double valorPago = sc.nextDouble();
        
        double litros = valorPago / precoLitro;
        
        System.out.printf("Você conseguiu colocar %.2f litros no tanque.%n", litros);
    }
}
