package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int [][] mat = new int [n][n];			//matriz n colunas
		
		for (int i=0; i<mat.length; i++) {			// percorre as linhas;
			for(int j=0; j<mat[i].length; j++) {				// percorre as colunas;
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Main diagonal:");
		for (int i=0; i<mat.length; i++) {
			System.out.println(mat[i][i]+"");
		}
		System.out.println();
		
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j]<0) {
					count++;
				}
			}
		}
		System.out.println("Negative Numbers:" + count);
		
		
		
		sc.close();
	}

}
