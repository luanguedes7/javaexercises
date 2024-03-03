package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Student> students = new HashSet<>();
		String[] letters = { "A", "B", "C" };

		for (int i = 0; i < 3; i++) {
			System.out.printf("How many students for course %s? ", letters[i]);
			int n = sc.nextInt();
			for (int j = 0; j < n; j++) {
				students.add(new Student(Integer.parseInt(sc.next())));
			}

		}
		System.out.println("Total students: " + students.size() + ".fF");

		sc.close();

	}

}
