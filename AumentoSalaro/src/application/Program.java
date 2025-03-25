package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		System.out.print("Quantos empregados irá registrar?");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Empregado #" + i + 1 + ": ");
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			
			Employee employee = new Employee(id, name, salary);
			list.add(employee.getId());
		}
		
		System.out.println("Informe o ID do empregado que terá salário aumentado:");
		int id = sc.nextInt();
		System.out.println("Informe a porcentagem de aumento do salário: ");
		double percentage = sc.nextDouble();
		
		
		sc.close();

	}

}
