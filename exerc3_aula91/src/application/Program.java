package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		People[] p = new People[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Dados da %dª Pessoa:%n", i+1);
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			sc.nextLine();
			double height = sc.nextDouble();
			
			p[i] = new People(name, age, height);
		}
		
		System.out.println(p);
		sc.close();

	}

}
