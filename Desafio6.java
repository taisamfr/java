/******************************************************************************
 
 6 - Faça um programa em Java para resolver a equação de 2º grau.        
         Pedir para o usuário entrar com as variáveis A, B e C .
         Mostrar o valor de x1, x2 e delta.
         
 *******************************************************************************/
 import java.util.Scanner;
 
 public class Desafio6 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
 
         System.out.print("Digite o coeficiente A: ");
         double A = scanner.nextDouble();
 
         System.out.print("Digite o coeficiente B: ");
         double B = scanner.nextDouble();
 
         System.out.print("Digite o coeficiente C: ");
         double C = scanner.nextDouble();
 
 
         double delta = Math.pow(B, 2) - 4 * A * C;
 
        
         System.out.printf("Delta (Δ) = %.2f%n", delta);
 
        
         if (delta < 0) {
             System.out.println("Não existem raízes reais.");
         } else {
            
             double x1 = (-B + Math.sqrt(delta)) / (2 * A);
             double x2 = (-B - Math.sqrt(delta)) / (2 * A);
 
            
             System.out.printf("x1 = %.2f%n", x1);
             System.out.printf("x2 = %.2f%n", x2);
         };
     }
 }