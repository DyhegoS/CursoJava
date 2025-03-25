package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CorrecaoRent;

public class CorrecaoPensionatoProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CorrecaoRent[] vect = new CorrecaoRent[10];
			
		System.out.print("Quantos quartos será lugado?");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Quarto Nª" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-Mail: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			
			vect[room] = new CorrecaoRent(name, email);
		}
		
		System.out.println();
		System.out.println("Quartos Ocupados:");
		for(int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ":" + vect[i]);			
			}
		}
		 
		sc.close();
	}

}
