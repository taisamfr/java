/******************************************************************************
Desenvolver um sistema bancário básico que permita criar contas para múltiplos usuários, 
realizar depósitos, saques e consultar saldos, utilizando apenas arrays e 
estruturas de controle fundamentais do Java.

*******************************************************************************/
import java.util.Scanner;

public class sistemaBancario {
    public static void main(String[] args) {
        // Arrays para armazenar os dados dos clientes
        String[] nomes = new String[5];
        double[] saldos = new double[5];
        int numeroDeClientes = 0;

        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Criar nova conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = ler.nextInt();
            ler.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    if (numeroDeClientes < 5) {
                        System.out.print("Digite o nome do cliente: ");
                        String nome = ler.nextLine();
                        nomes[numeroDeClientes] = nome;
                        saldos[numeroDeClientes] = 0.0;
                        numeroDeClientes++;
                        System.out.println("Conta criada com sucesso!");
                    } else {
                        System.out.println("Limite de contas atingido.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeDeposito = ler.nextLine();
                    boolean depositoEncontrado = false;
                    for (int i = 0; i < numeroDeClientes; i++) {
                        if (nomes[i].equals(nomeDeposito)) {
                            System.out.print("Digite o valor a ser depositado: R$ ");
                            double valorDeposito = ler.nextDouble();
                            saldos[i] += valorDeposito;
                            System.out.println("Depósito realizado com sucesso!");
                            depositoEncontrado = true;
                            break;
                        }
                    }
                    if (!depositoEncontrado) {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeSaque = ler.nextLine();
                    boolean saqueEncontrado = false;
                    for (int i = 0; i < numeroDeClientes; i++) {
                        if (nomes[i].equals(nomeSaque)) {
                            System.out.print("Digite o valor a ser sacado: R$ ");
                            double valorSaque = ler.nextDouble();
                            if (saldos[i] >= valorSaque) {
                                saldos[i] -= valorSaque;
                                System.out.println("Saque realizado com sucesso!");
                            } else {
                                System.out.println("Saldo insuficiente.");
                            }
                            saqueEncontrado = true;
                            break;
                        }
                    }
                    if (!saqueEncontrado) {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeConsulta = ler.nextLine();
                    boolean consultaEncontrada = false;
                    for (int i = 0; i < numeroDeClientes; i++) {
                        if (nomes[i].equals(nomeConsulta)) {
                            System.out.println("Saldo de " + nomes[i] + ": R$ " + saldos[i]);
                            consultaEncontrada = true;
                            break;
                        }
                    }
                    if (!consultaEncontrada) {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    ler.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}