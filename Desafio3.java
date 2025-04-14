/*******************************************
  3 - Cadastro de notas com classificação
 O programa deve permitir o cadastro de várias notas (entre 0 e 10). A cada nota inserida, o sistema deve classificar como:
 
 Excelente (>= 9)
 Bom (>= 7)
 Regular (>= 5)
 Insuficiente (< 5)
 *Quando o usuário digitar -1, o programa termina e exibe a média geral e a contagem de cada classificação.
 
  
  *****************************************/
  
  import java.util.Scanner;
 
 public class Desafio3 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         double somaNotas = 0;
         int contadorNotas = 0;
         int contadorExcelente = 0;
         int contadorBom = 0;
         int contadorRegular = 0;
         int contadorInsuficiente = 0;
 
         while (true) {
             System.out.print("Digite uma nota entre 0 e 10 (ou -1 para sair): ");
             double nota = scanner.nextDouble();
 
             if (nota == -1) {
                 break;
             }
 
             if (nota < 0 || nota > 10) {
                 System.out.println("Nota inválida! Por favor, insira uma nota entre 0 e 10.");
                 continue;
             }
             
             somaNotas += nota;
             contadorNotas++;
 
             
             if (nota >= 9) {
                 contadorExcelente++;
             } else if (nota >= 7) {
                 contadorBom++;
             } else if (nota >= 5) {
                 contadorRegular++;
             } else {
                 contadorInsuficiente++;
             }
         }
 
 
         double media = (contadorNotas > 0) ? (somaNotas / contadorNotas) : 0;
 
        
         System.out.println("\nResultados:");
         System.out.println("Média geral: " + media);
         System.out.println("Total de notas cadastradas: " + contadorNotas);
         System.out.println("----- Classificações -----");
         System.out.println("Excelente: " + contadorExcelente);
         System.out.println("Bom: " + contadorBom);
         System.out.println("Regular: " + contadorRegular);
         System.out.println("Insuficiente: " + contadorInsuficiente);
     }
 }