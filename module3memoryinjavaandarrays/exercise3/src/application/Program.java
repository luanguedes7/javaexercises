package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sumHeight = 0;
		double sumAgeLessThan16 = 0; 

		System.out.print("Quantas pessoas serão digitadas? ");
		int numbers = sc.nextInt();

		Person[] vect = new Person[numbers];
		String[] namesLessThan16 = new String[numbers];

		for (int i = 0 ; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %d a pessoa %n", i+1);
			System.out.println("Nome: ");
			String name = sc.nextLine();
			System.out.println("Idade: ");
			int age = sc.nextInt();
			System.out.println("Altura: ");
			double height = sc.nextDouble();

			vect[i] = new Person(name, age, height);
		}

		for (int i = 0; i < vect.length; i++) {
			sumHeight += vect[i].getHeight();
			
			
			if (vect[i].getAge() < 16) {
				sumAgeLessThan16 += 1.0;
				namesLessThan16[i] = vect[i].getName();
			}
		}
		
		double media = sumHeight/vect.length;
		
		double percentage = (sumAgeLessThan16/vect.length)*100.0;
		
		System.out.printf("Altura média: %.2f %n", media);
		System.out.print("Pessoas com menos de 16 anos:" + percentage + "%");
		System.out.println();
		for (int i = 0; i < namesLessThan16.length; i++) {
			if (namesLessThan16[i] != null) {
				System.out.println(namesLessThan16[i]);
			}
		}
		
		sc.close();

	}

}
