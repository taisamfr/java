/*
1- Sistema de votação com contagem por candidato
Simule uma eleição com 3 candidatos. Os votos são inseridos até que o usuário digite 0. O programa deve validar se o voto é válido (1, 2, 3) e exibir ao final a quantidade de votos por candidato e o vencedor. Empates devem ser considerados.
*/

import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int voto;
        int[] votos = {0, 0, 0}; // Votos para os candidatos 1, 2 e 3
        
        System.out.println("Sistema de Votação");
        System.out.println("Digite os votos para os candidatos (1, 2 ou 3). Digite 0 para encerrar.");
        
        do {
            System.out.print("Digite o número do candidato (1, 2, 3): ");
            voto = sc.nextInt();
            
            if (voto >= 1 && voto <= 3) {
                votos[voto - 1]++;
            } else if (voto != 0) {
                System.out.println("Voto inválido! Tente novamente.");
            }
        } while (voto != 0);
        
        System.out.println("\nResultado da votação:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Candidato " + (i + 1) + " recebeu " + votos[i] + " votos.");
        }
        
        int vencedor = 0;
        for (int i = 1; i < 3; i++) {
            if (votos[i] > votos[vencedor]) {
                vencedor = i;
            }
        }
        
        System.out.println("O vencedor é o Candidato " + (vencedor + 1));
        
        // Verificando empate
        if ((votos[0] == votos[1] && votos[1] == votos[2]) || (votos[0] == votos[1]) || (votos[1] == votos[2]) || (votos[0] == votos[2])) {
            System.out.println("Houve empate entre os candidatos!");
        }
    }
}