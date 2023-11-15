package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter Product Data :");
		System.out.println("Name :");
		product.name = sc.nextLine();
		System.out.println("Price : ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in Stock :");
		product.quantity = sc.nextInt();
		
		
		System.out.println();
		System.out.println("Product Data : " + product);
		
		System.out.println();
		System.out.println("Enter The Number of Products to be add in Stock ");
		int quantity = sc.nextInt();
		product.AddProducts(quantity);
		
		System.out.println();
		System.out.println("Updated  Data : " + product);
		
		System.out.println();
		System.out.println("Enter The Number of Products to be removed  in Stock ");
		quantity =sc.nextInt();
		product.RemoveProducts(quantity);
		System.out.println("Updated  Data : " + product);
		
		
		
		
		sc.close();
	}

}
