package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		Student student = new Student();
		
		System.out.println("Digite o nome do aluno:");
		student.name = sc.nextLine();
		System.out.println("Digite a 1 Nota :");
		student.grade1 = sc.nextDouble();
		System.out.println("Digite a 2 Nota :");
		student.grade2 = sc.nextDouble();
		System.out.println("Digite a 3 Nota :");
		student.grade3 = sc.nextDouble();
		
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		if (student.finalGrade() < 60.0) {
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		}
		else {
		System.out.println("PASS");
		}
		sc.close();

	}
	

}
