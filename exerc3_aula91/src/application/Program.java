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
		double sum = 0.0;
		double percentageLessSixteen = 0.0;
		int lessSixteen = 0;
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
			
			sum += p[i].getHeight();
			
			if(age < 16) {
				lessSixteen++;
			}						
		}
		
		String[] listLessSixteenNames = new String[p.length];	
		double avgHeight = sum / n;
		percentageLessSixteen = ((double)lessSixteen / n) * 100;
						
		System.out.println();
		System.out.printf("Media de altura: %.2f%n", avgHeight);
		System.out.println("Pessoas com menos de 16 anos: " + percentageLessSixteen + "%");
		System.out.println();
		
		for(int i = 0; i < p.length; i++) {
			if(p[i].getAge() < 16) {
				listLessSixteenNames[i] = p[i].getName();
				System.out.println(listLessSixteenNames[i]);
			}
		}	
		sc.close();

	}

}
