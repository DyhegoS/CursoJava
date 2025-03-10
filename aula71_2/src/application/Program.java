package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter radius:");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		//quando o metodo é estatico eu não preciso criar uma variavel que 
		//instancia a classe, eu chamo a classe direto
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Valume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", Calculator.PI);
		
		sc.close();

	}
	

}
