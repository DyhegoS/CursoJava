package application;

import java.util.Scanner;

public class Aula103 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int [][] mat = new int[n][n];

		//percorrendo as linha da matriz
		for(int l = 0; l < mat.length; l++) {
			//percorrendo as colunas da matriz
			for(int c = 0; c < mat[l].length; c++) {
				mat[l][c] = sc.nextInt();
			}
		}

		System.out.println("Diagonal Principal:");
		for(int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}

		System.out.println();
		
		int negatives = 0;
		for(int l = 0; l < mat.length; l++) {
			for(int c = 0; c < mat[l].length; c++) {
				if(mat[l][c] < 0) {
					negatives++;
				}
			}
		}
		System.out.println("Números negativos:");
		System.out.print(negatives);

		sc.close();

	}

}
