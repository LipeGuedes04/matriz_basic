package application;

import java.util.Scanner;

public class matriz_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// define o tamanho da matriz
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();

			}
		}
		// Pega os numeros da diagonal da matriz
		System.out.println("Main diagonal: ");
		for (int i = 0; i < n; i++) {
			System.out.println(mat[i][i] + " ");
		}

		// Pega os numeros negativos da matriz
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}

		// imprime os valores negativos presentes na matriz
		System.out.println("Negative numbers = " + count);

		sc.close();

	}

}
