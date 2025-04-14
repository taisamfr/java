/*********************************************
5 - Simulador de empréstimo com juros compostos
Peça ao usuário um valor de empréstimo e em quantas 
parcelas deseja pagar. Calcule o valor final com juros 
compostos de 2% ao mês. Mostre o valor final e o valor 
de cada parcela. Permita simular vários empréstimos.
**********************************************/
import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taxaJuros = 0.02;

        while (true) {
            System.out.print("Informe o valor do empréstimo (ou digite -1 para sair): R$ ");
            double valorEmprestimo = scanner.nextDouble();

            if (valorEmprestimo == -1) {
                break;
            }

            System.out.print("Informe o número de parcelas: ");
            int numeroParcelas = scanner.nextInt();

            double valorFinal = valorEmprestimo * Math.pow(1 + taxaJuros, numeroParcelas);
            double valorParcela = valorFinal / numeroParcelas;

           
            System.out.printf("Valor final a ser pago: R$ %.2f%n", valorFinal);
            System.out.printf("Valor de cada parcela: R$ %.2f%n", valorParcela);
            System.out.println(); 
        }

        System.out.println("Simulação encerrada.");
    }
}