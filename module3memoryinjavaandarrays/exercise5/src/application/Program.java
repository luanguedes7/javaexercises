package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] matrix = new int[m][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");

					try {
						System.out.println("Left: " + matrix[i][j - 1]);
					} catch (IndexOutOfBoundsException e) {

					}
					try {
						System.out.println("Right: " + matrix[i][j + 1]);
					} catch (IndexOutOfBoundsException e) {

					}
					try {
						System.out.println("Up: " + matrix[i - 1][j]);
					} catch (IndexOutOfBoundsException e) {

					}
					try {
						System.out.println("Down: " + matrix[i + 1][j]);
					} catch (IndexOutOfBoundsException e) {

					}

				}

			}
		}

		sc.close();

	}

}
