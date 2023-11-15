package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product rect = new Product();
		
		System.out.println("Enter Rectangule Width and Height : ");
		
		rect.Width = sc.nextDouble();
		rect.Height = sc.nextDouble();
				
		System.out.printf("AREA = %.2f%n", rect.Area());
		System.out.printf("PERIMETER = %.2f%n", rect.Perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.Diagonal());
		
		
		
		

	}

}
