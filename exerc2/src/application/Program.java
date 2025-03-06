package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee data;
		data = new Employee();
		System.out.print("Name: ");
		data.name = sc.next();
		System.out.print("Salary: ");
		data.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		data.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: %s, $%.2f%n", data.name, data.NetSalary());
		System.out.println();
		System.out.print("Wich percentage to increase Salary: ");
		double percentage = sc.nextDouble();
		data.IncreaseSalary(percentage);
		System.out.println();
		System.out.printf("Updated data:  %s, $%.2f%n", data.name, data.NetSalary());

		
		sc.close();

	}

}
