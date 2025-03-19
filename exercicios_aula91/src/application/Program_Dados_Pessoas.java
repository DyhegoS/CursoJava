package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados_Pessoas_Entitie;

public class Program_Dados_Pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		Dados_Pessoas_Entitie[] dp = new Dados_Pessoas_Entitie[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Altura da %dª pessoa:",i + 1);
			double height = sc.nextDouble();
			System.out.printf("Genero da %dª pessoa: ", i + 1);
			char gender = sc.next().charAt(0);
			dp[i] = new Dados_Pessoas_Entitie(gender, height);
		}
		
		double maxHeight = dp[0].getHeight();
		double minorHeight = dp[0].getHeight();
		int manCount = 0;
		int womanCount = 0;
		double avgF = 0.0;
		double sumHeightWoman = 0.0;
		
		for(int i = 0; i < n; i++) {
			if(dp[i].getHeight() > maxHeight) {
				maxHeight = dp[i].getHeight();
			}else if(dp[i].getHeight() < minorHeight){
				minorHeight = dp[i].getHeight();
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(dp[i].getGender() == 'M') {
				manCount++;
			}else {
				womanCount++;
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(dp[i].getGender() == 'F') {
				sumHeightWoman += dp[i].getHeight();
			}
		}
		avgF = sumHeightWoman / womanCount;
		
		System.out.println();
		System.out.printf("Menor Altura: %.2f%n", minorHeight);
		System.out.printf("Maior Altura: %.2f%n", maxHeight);
		System.out.printf("Media das alturas da mulheres: %.2f%n", avgF);
		System.out.println("Número de Homens: " + manCount);
		
		
		
		
		
		sc.close();
	}

}
