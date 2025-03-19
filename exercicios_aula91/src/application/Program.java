package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos número irá digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double maior = vect[0];
		int indexDoMaior = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			sc.nextLine();
			vect[i] = sc.nextDouble();
			
		}
		
		for(int i = 0; i < n; i++) {
			if(vect[i] > maior) {
				maior = vect[i];
				indexDoMaior = i;
			}
		}
		
		System.out.println("Maior valor: " + maior);
		System.out.println("Posição do maior número: "+ indexDoMaior);
		
		sc.close();

	}

}
