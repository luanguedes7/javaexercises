package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
			
		System.out.print("Quantos números você vai digitar? ");
		int numbers = sc.nextInt();
		
		double[] vect = new double[numbers];
		
		for(int i =0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i]= sc.nextDouble();
		}
		
		System.out.print("VALOLES =");
		for(int i =0; i < vect.length; i++) {
			System.out.print(" "+vect[i]);
			sum += vect[i];
		}
		
		double media = sum/vect.length;
		
		System.out.println();
		System.out.printf("SOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f%n", media);
		
		sc.close();

	}

}
