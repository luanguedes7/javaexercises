package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<Product>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Product #%d data: ", i + 1);
			System.out.println();
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Customs fee: ");
				Double fee = sc.nextDouble();

				products.add(new ImportedProduct(name, price, fee));

			} else if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

				products.add(new UsedProduct(name, price, date));

			} else {

				products.add(new Product(name, price));

			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for (Product p : products) {
			System.out.println(p.priceTag());
		}
		
		sc.close();

	}

}
