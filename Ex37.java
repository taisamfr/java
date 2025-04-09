/*
37 - Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras.
*/
import java.util.Scanner;

public class Ex37  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número de cavalos: ");
        int numCavalos = sc.nextInt();
        
        int ferradurasPorCavalo = 4;
        int totalFerraduras = numCavalos * ferradurasPorCavalo;
        
        System.out.println("Você precisará de " + totalFerraduras + " ferraduras.");
    }
}