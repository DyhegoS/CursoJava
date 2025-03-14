package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos número irá digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite o número: ");
			sc.nextLine();
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("Valores: " + String.format("%.2f", vect));
		sc.close();

	}

}
