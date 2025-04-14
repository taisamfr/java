/******************************************************************************
 
 1- Sistema de votação com contagem por candidato
 Simule uma eleição com 3 candidatos. Os votos são inseridos até que o usuário digite 0. 
 O programa deve validar se o voto é válido (1, 2, 3) e exibir ao final a quantidade de votos
 por candidato e o vencedor. Empates devem ser considerados.
 
 *******************************************************************************/
 import java.util.Scanner;
 public class Desafio1
 {
 	public static void main(String[] args) {
 	    Scanner scanner = new Scanner(System.in);
 	    
 	    int lula = 0;
         int bolsonaro = 0;
         int manga = 0;
         int opcao;
 		do {
 		    System.out.println("1 - Lula");
 		    System.out.println("2 - Bolsonaro");
 		    System.out.println("3 - Manga");
 		    System.out.println("0 - Sair");
 		    System.out.println("Escolha um candidato: ");
 		    opcao = scanner.nextInt();
 		    
 	     switch (opcao) {
                 case 1:
                     lula++;
                     break;
                 case 2:
                     bolsonaro++;
                     break;
                 case 3:
                     manga++;
                     break;
                 case 0:
                     break;
                 default:
                     System.out.println("Voto inválido! Por favor, vote apenas em 1, 2 ou 3.");
 	     }
 		} while (opcao != 0);
 	     
 	    System.out.println("\nResultado da Votação:");
         System.out.println("Candidato Lula: " + lula + " votos");
         System.out.println("Candidato Bolsonaro: " + bolsonaro + " votos");
         System.out.println("Candidato Manga: " + manga + " votos");
         
         if (lula > bolsonaro && lula > manga) {
            System.out.println("Lula é o vencedor!"); }
            else if (bolsonaro > lula && bolsonaro > manga){
            System.out.println("Bolsonaro é o vencedor!"); }
            else if (manga > bolsonaro && manga > lula) {
            System.out.println("Manga é o vencedor!"); }
            else if (bolsonaro == lula  && lula == manga) {
            System.out.println("Vamos para o segundo turno"); }
            else {
             System.out.println("Houve um empate entre os candidatos."); }
 	}
 }