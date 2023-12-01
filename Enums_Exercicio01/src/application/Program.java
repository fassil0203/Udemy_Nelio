package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //formatando a data
		
		System.out.println("Enter Department´s Name:");
		String departmenteName = sc.nextLine();
		System.out.println("Enter Worker Data: ");
		System.out.println("Name:");
		String workerName = sc.nextLine();
		System.out.println("Level:");
		String workerLevel = sc.nextLine();
		System.out.println("Base Salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel),baseSalary,new Department(departmenteName));
		System.out.println("How many contracts to this worker ?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n ; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.println("Date (DD/MM/YYYY):");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Valur per Hour :");
			double valueperHour = sc.nextDouble();
			System.out.println("Duration (hours):");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate,valueperHour,hours); // Contrato instanciado
			worker.addcontract(contract); // contrato associado ao trabalhador
			// Esse for vai ser repetido varias vezes, ate que os contratos associados.
			
			
		}
		System.out.println();
		System.out.println("Enter month and year to calculate income (MM/YYYY):");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));// fatiando  o mm
		int year  = Integer.parseInt(monthAndYear.substring(3));	// fatiando o yyyy
		System.out.println("Name:"+ worker.getName());
		System.out.println("Department:" + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear +":" + String.format("%.2f",worker.income(year, month)));
			
		sc.close();
		
		
	}

}
