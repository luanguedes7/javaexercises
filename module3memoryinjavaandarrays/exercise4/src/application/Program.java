package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered?");
		int nEmployees = sc.nextInt();

		List<Employee> list = new ArrayList<Employee>();

		for (int i = 0; i < nEmployees; i++) {

			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			Employee employee = new Employee(id, name, salary);

			list.add(employee);
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {

			System.out.println("This id does not exist!");

		} else {

			System.out.println("Enter percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Employee idEmp: list) {
			System.out.println(idEmp);
		}

		sc.close();

	}

}
