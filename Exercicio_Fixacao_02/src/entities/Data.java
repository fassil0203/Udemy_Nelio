package entities;

public class Data {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	
	public double NetSalary() {
		return grossSalary - tax;
		
	}

	public void IncreaseSalary (double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f", NetSalary());
		}

}
