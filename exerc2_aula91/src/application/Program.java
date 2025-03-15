package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos número irá digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite o número: ");
			sc.nextLine();
			vect[i] = sc.nextDouble();
		}
		
		
		double sum = 0;
		for(int i = 0; i < n; i++) {			
			sum += vect[i];
		}
		
		double avg = sum / n;
		System.out.println("Valores: " + Arrays.toString(vect).replace("[", "").replace("]", "").replace(",", " "));
		System.out.printf("Soma: %.2f%n", sum);
		System.out.printf("Média: %.2f", avg);
		sc.close();

	}

}
