package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; i++) {
				mat[m][n] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; i++) {
				if(x == mat[i][j]) {
					System.out.println(x);
				}
			}
		}

	}

}
