package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int up = 0;
		int down = 0;
		int left = 0;
		int right = 0;

		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];

		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt();
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(x == mat[i][j]) {
					System.out.println("Posição: " + i + ", " + j);
					if(j < n && j + 1 < n ) {
						right = mat[i][j + 1];
						System.out.println("Direita: " + right);
					}
					if(j > 0) {
						left = mat[i][j - 1];
						System.out.println("Esquerda: " + left);
					}
					if(i < m && i + 1 < m) {
						down = mat[i + 1][j];
						System.out.println("Baixo:" + down);
					}
					if(i > 0) {
						up = mat[i - 1][j];
						System.out.println("Cima: " + up);
					}
				}

			}

		}
		sc.close();
	}

}
