import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a qtde de Numeros :");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um Numero :");
			vet[i] = sc.nextInt();

		}
		System.out.println("Numeros Negativos :");
		for (int i = 0; i < n; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}

		}
		System.out.println("Numeros Positivos");
		for (int i = 0; i < n; i++) {
			if (vet[i] > 0) {
				System.out.println(vet[i]);
			}

			sc.close();

		}

	}
}
