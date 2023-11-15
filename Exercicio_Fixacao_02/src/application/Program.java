package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Data;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Data emp = new Data();
		
		System.out.println("Name :");
		emp.name=sc.nextLine();
		System.out.println("Gross Salary :");
		emp.grossSalary=sc.nextDouble();
		System.out.println("Tax :");
		emp.tax =sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.IncreaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + emp);
		sc.close();

		
	}

}
