package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a Quantidade de Produtos :");
		int n = sc.nextInt();
		Product[] vect = new Product[n];

		for (int i=0; i<vect.length; i++) {			//pode-se usar a variavel length
			sc.nextLine();
			System.out.println("Digite o Nome do Produto :");
			String name = sc.nextLine();
			System.out.println("Digite o Preco do Produto R$ :");
			double price = sc.nextDouble();
			vect [i] = new Product(name, price);
		}
			
			double sum = 0.0;
			for (int i=0; i<vect.length; i++) {
				sum += vect[i].getPrice();
			}
			double avg = sum /vect.length;
			
			System.out.printf("AVERAGE PRICE = %.2f%n", avg);
			System.out.printf("A Soma total dos Produtos é R$: %.2f%n ",sum);

		sc.close();
	}

}
