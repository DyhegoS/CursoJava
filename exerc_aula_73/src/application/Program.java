package application;

import java.util.Locale;
import java.util.Scanner;

import utils.Converter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		Converter.cotacao = sc.nextDouble();
		System.out.print("How many dollars you will be bought? ");
		Converter.dollar = sc.nextDouble();
		System.out.printf("Amount to be paid in Reais = %.2f%n", Converter.currencyConverter());
		
		sc.close();
		

	}

}
