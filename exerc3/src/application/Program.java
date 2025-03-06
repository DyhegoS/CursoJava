package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CalcNotas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CalcNotas data;
		data = new CalcNotas();
		System.out.println("Escreva o nome e as notas abaixo:");
		data.name = sc.next();
		data.grade1 = sc.nextDouble();
		data.grade2 = sc.nextDouble();
		data.grade3 = sc.nextDouble();
		
		System.out.printf("Final Grade %s: %.2f%n", data.name, data.sumGrade());
		
		if(data.verifyGrade()) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING: %.2f POINTS", data.missing);
		}
		
		sc.close();
		

	}

}
