/******************************************************************************

2 - Jogo de adivinhação com dificuldade
Crie um jogo de adivinhação onde o jogador escolhe a dificuldade 
(fácil: 1 a 10, médio: 1 a 50, difícil: 1 a 100).
O programa gera um número aleatório(pesquisar) e o jogador tem 
5 tentativas para acertar. A cada erro, o programa dá dicas: "maior" ou "menor".

*******************************************************************************/
import java.util.Random;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Escolha a dificuldade:");
        System.out.println("1. Fácil (1 a 10)");
        System.out.println("2. Médio (1 a 50)");
        System.out.println("3. Difícil (1 a 100)");
        
        int dificuldade = scanner.nextInt();
        int limiteSuperior = 0;

        switch (dificuldade) {
            case 1:
                limiteSuperior = 10;
                break;
            case 2:
                limiteSuperior = 50;
                break;
            case 3:
                limiteSuperior = 100;
                break;
            default:
                System.out.println("Dificuldade inválida.");
                return;
        }

        int numeroSecreto = random.nextInt(limiteSuperior) + 1;
        int tentativas = 5;
        boolean acertou = false;

        System.out.println("Você tem " + tentativas + " tentativas para adivinhar o número entre 1 e " + limiteSuperior + ".");

        while (tentativas > 0 && !acertou) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();

            if (palpite < 1 || palpite > limiteSuperior) {
                System.out.println("Por favor, escolha um número entre 1 e " + limiteSuperior + ".");
                continue;
            }

            if (palpite == numeroSecreto) {
                acertou = true;
                System.out.println("Parabéns! Você acertou o número: " + numeroSecreto);
            } else {
                tentativas--;
                if (palpite < numeroSecreto) {
                    System.out.println("Maior! Você ainda tem " + tentativas + " tentativas.");
                } else {
                    System.out.println("Menor! Você ainda tem " + tentativas + " tentativas.");
                }
            }
        }

        if (!acertou) {
            System.out.println("Você perdeu! O número era: " + numeroSecreto);
        }
    }
}