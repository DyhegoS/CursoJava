package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos número vai digitar?");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite o número: ");
			sc.nextLine();
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Números negativos: ");
		for(int i = 0; i < n; i++) {
			if(vect[i] < 0) {
				int numNegativo = vect[i];
				System.out.println(numNegativo);
			}
		}
		
		sc.close();

	}

}
