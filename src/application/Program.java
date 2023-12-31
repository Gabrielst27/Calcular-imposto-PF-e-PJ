package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> payers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c): ");
			String type = sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			
			if(type.toUpperCase().equals("I")) {
				System.out.print("Health expendictures: ");
				double healthSpending = sc.nextDouble();
				payers.add(new NaturalPerson(name, annualIncome, healthSpending));
			} else if (type.toUpperCase().equals("C")) {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				payers.add(new LegalPerson(name, annualIncome, numberOfEmployees));
			}
		}
		
		double totalTaxes = 0;
		System.out.printf("\nTAXES PAID:\n");
		for(Person p : payers) {
			System.out.println(p);
			totalTaxes += (double)p.tax();
		}
		
		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
		
		sc.close();

	}

}
