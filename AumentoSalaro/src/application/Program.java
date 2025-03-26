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
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Quantos empregados irá registrar?");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Empregado #" + (i + 1) + ": ");
			System.out.print("ID: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("ID já em uso, informe outro ID!");
				System.out.println();
				System.out.print("ID: ");
				id = sc.nextInt();
			}
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			
			Employee employee = new Employee(id, name, salary);
			list.add(employee);
		}
		
		System.out.print("Informe o ID do empregado que terá salário aumentado:");
		int id = sc.nextInt();
		Employee checkID = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(checkID != null) {
			System.out.print("Informe a porcentagem de aumento do salário: ");
			double percentage = sc.nextDouble();
			checkID.increaseSalary(percentage);
		}else {
			System.out.println("ID informando não existe!!!");
		}
		
		System.out.println();
		System.out.println("Lista de empregados:");
		for(Employee result : list) {
			System.out.println(result);
		}
		
		sc.close();

	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
