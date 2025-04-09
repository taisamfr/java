/*

46 - Desenvolver um programa com  Ao iniciar o programa, exiba o seguinte menu de opções:

--- Calculadora de Áreas --- 
1. Calcular Área do Retângulo 
2. Calcular Área do Triângulo 
3. Calcular Área do Círculo 
0. Sair 
-- Escolha uma opção:
*/

import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcao;
        
        do {
            System.out.println("--- Calculadora de Áreas ---");
            System.out.println("1. Calcular Área do Retângulo");
            System.out.println("2. Calcular Área do Triângulo");
            System.out.println("3. Calcular Área do Círculo");
            System.out.println("0. Sair");
            System.out.print("-- Escolha uma opção: ");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite a base do retângulo: ");
                    double base = sc.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double altura = sc.nextDouble();
                    double areaRetangulo = base * altura;
                    System.out.printf("Área do Retângulo: %.2f%n", areaRetangulo);
                    break;
                
                case 2:
                    System.out.print("Digite a base do triângulo: ");
                    double baseTriangulo = sc.nextDouble();
                    System.out.print("Digite a altura do triângulo: ");
                    double alturaTriangulo = sc.nextDouble();
                    double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                    System.out.printf("Área do Triângulo: %.2f%n", areaTriangulo);
                    break;
                
                case 3:
                    System.out.print("Digite o raio do círculo: ");
                    double raio = sc.nextDouble();
                    double areaCirculo = Math.PI * raio * raio;
                    System.out.printf("Área do Círculo: %.2f%n", areaCirculo);
                    break;
                
                case 0:
                    System.out.println("Saindo...");
                    break;
                
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}
