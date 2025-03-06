package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159;
	//palavra final faz com que o valor da constante uma vez atribuido não muda
	//padrão de nomes para constante devem ser tudo em maiusculo
	//se tiver mais de uma palavra colocar o underline
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius:");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v =volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Valume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", PI);
		
		sc.close();

	}
	
	//dentro da mesma classe não se pode chamar outros metodos que não sejam static
	//o static é obrigatorio nesse caso
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
