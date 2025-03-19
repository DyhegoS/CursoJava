package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos números vai digitar? ");
		int n = sc.nextInt();
		int[] array = new int[n];
		List<Integer> pares = new ArrayList<>();
		int par = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite o número: ");
			sc.nextLine();
			array[i] = sc.nextInt();
			
			if(array[i] % 2 == 0) {
				pares.add(array[i]);
				par++;
			}
		}
		
		
		System.out.println("Números pares: " + pares);
		System.out.println("Quantidade de pares: " + par);
		
		sc.close();

	}

}
