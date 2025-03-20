package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		Rooms[] rooms = new Rooms[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Rent #%d%n", i+1);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			rooms[i] = new Rooms(room, name, email);

		}
		
		
		
		System.out.println("Busy rooms:");
		for(int i = 0; i < n; i++) {
			if(rooms[i] != null) {
				System.out.println(rooms[i].getRoom() + ":" + rooms[i].getName() + ", " + rooms[i].getEmail());
			}
		}
		
		
		sc.close();

	}

}
