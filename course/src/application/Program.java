package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		System.out.println("Informe as medidas do Triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Informe as medidas do Triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Area X: %.4f%n", areaX);
		System.out.printf("Area Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Area do triangulo X é maior!");
		
		}else {
			System.out.println("Area do triangulo Y é maior!");
			
		}
		
		sc.close();

	}

}