package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números terá cada vetor? ");
		int n = sc.nextInt();
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];
		
		for(int i = 0; i< n; i++) {
			System.out.print("Digite um número para o vetor A: ");
			vectA[i] = sc.nextInt();
		}
		System.out.println();
		for(int i = 0; i< n; i++) {
			System.out.print("Digite um número para o vetor B: ");
			vectB[i] = sc.nextInt();
		}
		
		for(int i = 0; i< n; i++) {
			vectC[i] = vectA[i] + vectB[i];
		}
		
		System.out.printf("Soma dos vetores é: " + Arrays.toString(vectC));
		sc.close();
		}

}
