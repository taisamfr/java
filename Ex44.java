/*

44 - Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar. Faça um
algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que
Carlos e André não paguem centavos. Ex: uma conta de R$101,53 resulta em R$33,00 para
Carlos, R$33,00 para André e R$35,53 para Felipe.
*/

import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual o valor total da conta? R$");
        double valorConta = sc.nextDouble();
        
        int parteCarlosAndre = (int) (valorConta / 3);
        double parteFelipe = valorConta - (2 * parteCarlosAndre);
        
        System.out.printf("Carlos paga R$%.2f%n", (double) parteCarlosAndre);
        System.out.printf("André paga R$%.2f%n", (double) parteCarlosAndre);
        System.out.printf("Felipe paga R$%.2f%n", parteFelipe);
    }
}
