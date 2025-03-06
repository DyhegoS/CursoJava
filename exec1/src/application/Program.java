package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Rectangle data;

		data = new Rectangle();


		System.out.println("Enter Rectangle width and Height: ");
		data.width= sc.nextDouble();
		data.height = sc.nextDouble();
				
		System.out.printf("AREA: %.2f%n", data.Area());
		System.out.printf("PERIMETER: %.2f%n", data.Perimeter());
		System.out.printf("Diagonal: %.2f%n", data.Diagonal());
		
		sc.close();	

	}

}
